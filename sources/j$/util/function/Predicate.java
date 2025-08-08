package j$.util.function;

import j$.util.function.Predicate;

/* loaded from: classes2.dex */
public interface Predicate<T> {

    public final /* synthetic */ class VivifiedWrapper implements Predicate {
        public final /* synthetic */ java.util.function.Predicate a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof w0 ? ((w0) predicate).a : new VivifiedWrapper(predicate);
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate and(Predicate predicate) {
            return convert(this.a.and(w0.a(predicate)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.Predicate predicate = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return predicate.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate negate() {
            return convert(this.a.negate());
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate or(Predicate predicate) {
            return convert(this.a.or(w0.a(predicate)));
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            return this.a.test(obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);

    public final /* synthetic */ class -CC {
        public static Predicate $default$negate(final Predicate predicate) {
            return new Predicate() { // from class: j$.util.function.v0
                @Override // j$.util.function.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate2) {
                    return Predicate.-CC.$default$and(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public final /* synthetic */ Predicate negate() {
                    return Predicate.-CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate2) {
                    return Predicate.-CC.$default$or(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return !Predicate.this.test(obj);
                }
            };
        }

        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new u0(predicate, predicate2, 0);
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new u0(predicate, predicate2, 1);
        }
    }
}
