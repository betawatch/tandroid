package org.telegram.ui;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b extends ro {
    @Override // ro
    public final void c(Object obj, float f) {
        ((ArticleViewer$WindowView) obj).setInnerTranslationX(f);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
    }
}
