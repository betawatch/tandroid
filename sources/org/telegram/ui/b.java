package org.telegram.ui;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b extends rn {
    @Override // rn
    public final void c(Object obj, float f) {
        ((ArticleViewer$WindowView) obj).setInnerTranslationX(f);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
    }
}
