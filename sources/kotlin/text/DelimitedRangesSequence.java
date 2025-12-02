package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
final class DelimitedRangesSequence implements Sequence {
    private final Function2 getNextMatch;
    private final CharSequence input;
    private final int limit;
    private final int startIndex;

    public DelimitedRangesSequence(CharSequence input, int i, int i2, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i;
        this.limit = i2;
        this.getNextMatch = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new Iterator() { // from class: kotlin.text.DelimitedRangesSequence$iterator$1
            private int counter;
            private int currentStartIndex;
            private IntRange nextItem;
            private int nextSearchIndex;
            private int nextState = -1;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            {
                int i;
                CharSequence charSequence;
                i = DelimitedRangesSequence.this.startIndex;
                charSequence = DelimitedRangesSequence.this.input;
                int coerceIn = RangesKt.coerceIn(i, 0, charSequence.length());
                this.currentStartIndex = coerceIn;
                this.nextSearchIndex = coerceIn;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
            
                if (r0 < r4) goto L9;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final void calcNext() {
                int i;
                CharSequence charSequence;
                Function2 function2;
                CharSequence charSequence2;
                CharSequence charSequence3;
                CharSequence charSequence4;
                int i2;
                if (this.nextSearchIndex >= 0) {
                    i = DelimitedRangesSequence.this.limit;
                    if (i > 0) {
                        int i3 = this.counter + 1;
                        this.counter = i3;
                        i2 = DelimitedRangesSequence.this.limit;
                    }
                    int i4 = this.nextSearchIndex;
                    charSequence = DelimitedRangesSequence.this.input;
                    if (i4 <= charSequence.length()) {
                        function2 = DelimitedRangesSequence.this.getNextMatch;
                        charSequence2 = DelimitedRangesSequence.this.input;
                        Pair pair = (Pair) function2.invoke(charSequence2, Integer.valueOf(this.nextSearchIndex));
                        if (pair == null) {
                            int i5 = this.currentStartIndex;
                            charSequence3 = DelimitedRangesSequence.this.input;
                            this.nextItem = new IntRange(i5, StringsKt__StringsKt.getLastIndex(charSequence3));
                            this.nextSearchIndex = -1;
                        } else {
                            int intValue = ((Number) pair.component1()).intValue();
                            int intValue2 = ((Number) pair.component2()).intValue();
                            this.nextItem = RangesKt.until(this.currentStartIndex, intValue);
                            int i6 = intValue + intValue2;
                            this.currentStartIndex = i6;
                            this.nextSearchIndex = i6 + (intValue2 == 0 ? 1 : 0);
                        }
                        this.nextState = 1;
                        return;
                    }
                    int i7 = this.currentStartIndex;
                    charSequence4 = DelimitedRangesSequence.this.input;
                    this.nextItem = new IntRange(i7, StringsKt__StringsKt.getLastIndex(charSequence4));
                    this.nextSearchIndex = -1;
                    this.nextState = 1;
                    return;
                }
                this.nextState = 0;
                this.nextItem = null;
            }

            @Override // java.util.Iterator
            public IntRange next() {
                if (this.nextState == -1) {
                    calcNext();
                }
                if (this.nextState == 0) {
                    throw new NoSuchElementException();
                }
                IntRange intRange = this.nextItem;
                Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.nextItem = null;
                this.nextState = -1;
                return intRange;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.nextState == -1) {
                    calcNext();
                }
                return this.nextState == 1;
            }
        };
    }
}
