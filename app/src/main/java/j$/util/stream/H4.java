package j$.util.stream;

import j$.util.AbstractC0039a;
import java.util.Comparator;
/* loaded from: classes2.dex */
public abstract class H4 extends J4 implements j$.util.w {
    public H4(j$.util.w wVar, long j, long j2) {
        super(wVar, j, j2);
    }

    public H4(j$.util.w wVar, H4 h4) {
        super(wVar, h4);
    }

    @Override // j$.util.w
    /* renamed from: forEachRemaining */
    public void e(Object obj) {
        obj.getClass();
        AbstractC0113j4 abstractC0113j4 = null;
        while (true) {
            int r = r();
            if (r != 1) {
                if (r != 2) {
                    ((j$.util.w) this.a).forEachRemaining(obj);
                    return;
                }
                if (abstractC0113j4 == null) {
                    abstractC0113j4 = t(128);
                } else {
                    abstractC0113j4.b = 0;
                }
                long j = 0;
                while (((j$.util.w) this.a).tryAdvance(abstractC0113j4)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                abstractC0113j4.b(obj, p(j));
            } else {
                return;
            }
        }
    }

    @Override // j$.util.u
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.u
    public /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0039a.e(this);
    }

    @Override // j$.util.u
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0039a.f(this, i);
    }

    protected abstract void s(Object obj);

    protected abstract AbstractC0113j4 t(int i);

    @Override // j$.util.w
    /* renamed from: tryAdvance */
    public boolean k(Object obj) {
        obj.getClass();
        while (r() != 1 && ((j$.util.w) this.a).tryAdvance(this)) {
            if (p(1L) == 1) {
                s(obj);
                return true;
            }
        }
        return false;
    }
}
