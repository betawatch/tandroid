// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jl3 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                TextView textView = new TextView((Context) obj);
                anb.X(textView, cmb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setLineSpacing(gm.L(2.0f), 1.0f);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                textView2.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
                textView2.setTextSize(1, 16.0f);
                anb.X(textView2, cmb.F6, null);
                anb.D(textView2, cmb.G6, null);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity((jb6.a0 ? 5 : 3) | 1);
                return textView2;
            case 2:
                TextView textView3 = new TextView((Context) obj);
                anb.X(textView3, cmb.C6, null);
                textView3.setGravity(1);
                textView3.setLineSpacing(gm.L(2.0f), 1.0f);
                textView3.setTextSize(1, 15.0f);
                return textView3;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                return new gb8(photoViewer.F, photoViewer.U1, photoViewer.R, new v88(photoViewer, (byte) 0), new fh6(photoViewer, b2));
        }
    }
}
