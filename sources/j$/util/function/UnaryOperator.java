package j$.util.function;

import j$.util.function.Function;

/* loaded from: classes2.dex */
public interface UnaryOperator<T> extends Function<T, T> {

    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {
        public final /* synthetic */ java.util.function.UnaryOperator a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return unaryOperator instanceof F0 ? ((F0) unaryOperator).a : new VivifiedWrapper(unaryOperator);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return Function.VivifiedWrapper.convert(this.a.andThen(z.a(function)));
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.a.apply(obj);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function compose(Function function) {
            return Function.VivifiedWrapper.convert(this.a.compose(z.a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.UnaryOperator unaryOperator = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return unaryOperator.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }
    }
}
