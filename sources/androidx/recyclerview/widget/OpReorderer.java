package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;
/* loaded from: classes.dex */
class OpReorderer {
    final Callback mCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            }
            swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
        }
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i, int i2) {
        AdapterHelper.UpdateOp updateOp = list.get(i);
        AdapterHelper.UpdateOp updateOp2 = list.get(i2);
        int i3 = updateOp2.cmd;
        if (i3 == 1) {
            swapMoveAdd(list, i, updateOp, i2, updateOp2);
        } else if (i3 == 2) {
            swapMoveRemove(list, i, updateOp, i2, updateOp2);
        } else if (i3 != 4) {
        } else {
            swapMoveUpdate(list, i, updateOp, i2, updateOp2);
        }
    }

    void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i2, AdapterHelper.UpdateOp updateOp2) {
        boolean z;
        int i3 = updateOp.positionStart;
        int i4 = updateOp.itemCount;
        boolean z2 = false;
        if (i3 < i4) {
            if (updateOp2.positionStart != i3 || updateOp2.itemCount != i4 - i3) {
                z = false;
            }
            z = z2;
            z2 = true;
        } else if (updateOp2.positionStart == i4 + 1 && updateOp2.itemCount == i3 - i4) {
            z2 = true;
            z = z2;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = updateOp2.positionStart;
        if (i4 < i5) {
            updateOp2.positionStart = i5 - 1;
        } else {
            int i6 = updateOp2.itemCount;
            if (i4 < i5 + i6) {
                updateOp2.itemCount = i6 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i2);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i7 = updateOp.positionStart;
        int i8 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOp3 = null;
        if (i7 <= i8) {
            updateOp2.positionStart = i8 + 1;
        } else {
            int i9 = i8 + updateOp2.itemCount;
            if (i7 < i9) {
                updateOp3 = this.mCallback.obtainUpdateOp(2, i7 + 1, i9 - i7, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z2) {
            list.set(i, updateOp2);
            list.remove(i2);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z) {
            if (updateOp3 != null) {
                int i10 = updateOp.positionStart;
                if (i10 > updateOp3.positionStart) {
                    updateOp.positionStart = i10 - updateOp3.itemCount;
                }
                int i11 = updateOp.itemCount;
                if (i11 > updateOp3.positionStart) {
                    updateOp.itemCount = i11 - updateOp3.itemCount;
                }
            }
            int i12 = updateOp.positionStart;
            if (i12 > updateOp2.positionStart) {
                updateOp.positionStart = i12 - updateOp2.itemCount;
            }
            int i13 = updateOp.itemCount;
            if (i13 > updateOp2.positionStart) {
                updateOp.itemCount = i13 - updateOp2.itemCount;
            }
        } else {
            if (updateOp3 != null) {
                int i14 = updateOp.positionStart;
                if (i14 >= updateOp3.positionStart) {
                    updateOp.positionStart = i14 - updateOp3.itemCount;
                }
                int i15 = updateOp.itemCount;
                if (i15 >= updateOp3.positionStart) {
                    updateOp.itemCount = i15 - updateOp3.itemCount;
                }
            }
            int i16 = updateOp.positionStart;
            if (i16 >= updateOp2.positionStart) {
                updateOp.positionStart = i16 - updateOp2.itemCount;
            }
            int i17 = updateOp.itemCount;
            if (i17 >= updateOp2.positionStart) {
                updateOp.itemCount = i17 - updateOp2.itemCount;
            }
        }
        list.set(i, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i2, updateOp);
        } else {
            list.remove(i2);
        }
        if (updateOp3 != null) {
            list.add(i, updateOp3);
        }
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i2, AdapterHelper.UpdateOp updateOp2) {
        int i3 = updateOp.itemCount;
        int i4 = updateOp2.positionStart;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = updateOp.positionStart;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            updateOp.positionStart = i6 + updateOp2.itemCount;
        }
        int i7 = updateOp2.positionStart;
        if (i7 <= i3) {
            updateOp.itemCount = i3 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i7 + i5;
        list.set(i, updateOp2);
        list.set(i2, updateOp);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void swapMoveUpdate(List<AdapterHelper.UpdateOp> list, int i, AdapterHelper.UpdateOp updateOp, int i2, AdapterHelper.UpdateOp updateOp2) {
        AdapterHelper.UpdateOp obtainUpdateOp;
        int i3;
        int i4;
        int i5 = updateOp.itemCount;
        int i6 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOp3 = null;
        if (i5 < i6) {
            updateOp2.positionStart = i6 - 1;
        } else {
            int i7 = updateOp2.itemCount;
            if (i5 < i6 + i7) {
                updateOp2.itemCount = i7 - 1;
                obtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
                i3 = updateOp.positionStart;
                i4 = updateOp2.positionStart;
                if (i3 > i4) {
                    updateOp2.positionStart = i4 + 1;
                } else {
                    int i8 = i4 + updateOp2.itemCount;
                    if (i3 < i8) {
                        int i9 = i8 - i3;
                        updateOp3 = this.mCallback.obtainUpdateOp(4, i3 + 1, i9, updateOp2.payload);
                        updateOp2.itemCount -= i9;
                    }
                }
                list.set(i2, updateOp);
                if (updateOp2.itemCount <= 0) {
                    list.set(i, updateOp2);
                } else {
                    list.remove(i);
                    this.mCallback.recycleUpdateOp(updateOp2);
                }
                if (obtainUpdateOp != null) {
                    list.add(i, obtainUpdateOp);
                }
                if (updateOp3 == null) {
                    list.add(i, updateOp3);
                    return;
                }
                return;
            }
        }
        obtainUpdateOp = null;
        i3 = updateOp.positionStart;
        i4 = updateOp2.positionStart;
        if (i3 > i4) {
        }
        list.set(i2, updateOp);
        if (updateOp2.itemCount <= 0) {
        }
        if (obtainUpdateOp != null) {
        }
        if (updateOp3 == null) {
        }
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
