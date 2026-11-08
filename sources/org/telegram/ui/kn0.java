package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ kn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.V1((ClickableSpan) obj, (TextView) obj2);
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.w0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                break;
        }
    }
}
