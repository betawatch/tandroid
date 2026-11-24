package org.telegram.ui;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b extends qn {
    @Override // qn
    public final void c(Object obj, float f) {
        ((ArticleViewer$WindowView) obj).setInnerTranslationX(f);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
    }
}
