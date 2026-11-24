package org.telegram.ui;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
