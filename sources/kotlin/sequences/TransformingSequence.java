package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TransformingSequence implements Sequence {
    private final Sequence sequence;
    private final Function1 transformer;

    public TransformingSequence(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new Iterator() { // from class: kotlin.sequences.TransformingSequence$iterator$1
            private final Iterator iterator;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            {
                Sequence sequence;
                sequence = TransformingSequence.this.sequence;
                this.iterator = sequence.iterator();
            }

            @Override // java.util.Iterator
            public Object next() {
                Function1 function1;
                function1 = TransformingSequence.this.transformer;
                return function1.invoke(this.iterator.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }
        };
    }
}
