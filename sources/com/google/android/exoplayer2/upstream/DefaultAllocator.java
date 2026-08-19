package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class DefaultAllocator implements Allocator {
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        Assertions.checkArgument(i > 0);
        Assertions.checkArgument(i2 >= 0);
        this.trimOnReset = z;
        this.individualAllocationSize = i;
        this.availableCount = i2;
        this.availableAllocations = new Allocation[i2 + 100];
        if (i2 > 0) {
            this.initialAllocationBlock = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.availableAllocations[i3] = new Allocation(this.initialAllocationBlock, i3 * i);
            }
            return;
        }
        this.initialAllocationBlock = null;
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized Allocation allocate() {
        this.allocatedCount++;
        int i = this.availableCount;
        if (i > 0) {
            Allocation[] allocationArr = this.availableAllocations;
            int i2 = i - 1;
            this.availableCount = i2;
            Allocation allocation = (Allocation) Assertions.checkNotNull(allocationArr[i2]);
            this.availableAllocations[this.availableCount] = null;
            return allocation;
        }
        Allocation allocation2 = new Allocation(new byte[this.individualAllocationSize], 0);
        int i3 = this.allocatedCount;
        Allocation[] allocationArr2 = this.availableAllocations;
        if (i3 <= allocationArr2.length) {
            return allocation2;
        }
        this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
        return allocation2;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i = this.availableCount;
        this.availableCount = i + 1;
        allocationArr[i] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.availableAllocations;
                int i = this.availableCount;
                this.availableCount = i + 1;
                allocationArr[i] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r0 >= r7.availableCount) goto L21;
     */
    @Override // com.google.android.exoplayer2.upstream.Allocator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void trim() {
        try {
            int i = 0;
            int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i2 = this.availableCount;
            if (max < i2) {
                if (this.initialAllocationBlock != null) {
                    int i3 = i2 - 1;
                    while (i <= i3) {
                        Allocation allocation = (Allocation) Assertions.checkNotNull(this.availableAllocations[i]);
                        if (allocation.data == this.initialAllocationBlock) {
                            i++;
                        } else {
                            Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.availableAllocations[i3]);
                            if (allocation2.data != this.initialAllocationBlock) {
                                i3--;
                            } else {
                                Allocation[] allocationArr = this.availableAllocations;
                                allocationArr[i] = allocation2;
                                allocationArr[i3] = allocation;
                                i3--;
                                i++;
                            }
                        }
                    }
                    max = Math.max(max, i);
                }
                Arrays.fill(this.availableAllocations, max, this.availableCount, (Object) null);
                this.availableCount = max;
            }
        } finally {
        }
    }

    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }
}
