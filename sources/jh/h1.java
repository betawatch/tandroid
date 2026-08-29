package jh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h1 extends FrameLayout implements vd.b {
    public final org.telegram.ui.ActionBar.c6 a;
    public final FrameLayout b;
    public final ih.v1 c;
    public final org.telegram.ui.Components.t9 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final vd.a r;
    public boolean s;
    public f1 v;

    public h1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = new vd.a(0, this, jr.h, 320L, false);
        this.a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        ih.v1 v1Var = new ih.v1(frameLayout, c6Var, true);
        this.c = v1Var;
        frameLayout.setBackground(v1Var);
        v1Var.v = 1;
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        t9Var.getImageReceiver().setAutoRepeat(0);
        addView(t9Var, i7.f6.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, i7.f6.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, i7.f6.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(h1 h1Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        org.telegram.ui.Components.t9 t9Var = h1Var.d;
        if (document == null) {
            t9Var.b();
            h1Var.n = null;
            return;
        }
        if (h1Var.n == document) {
            return;
        }
        h1Var.n = document;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.a7, 0.3f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i10);
        sb2.append(z10 ? "_nolimit_pcache" : "");
        String sb3 = sb2.toString();
        t9Var.setLayoutParams(i7.f6.d(i10, i10, 49, 0.0f, r3 + 17, 0.0f, (80 - i10) / 2));
        t9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        b();
    }

    public final void b() {
        int d;
        ih.v1 v1Var = this.c;
        v1Var.x = null;
        Integer num = this.h;
        vd.a aVar = this.r;
        TextView textView = this.f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.l1(AndroidUtilities.lerp(0.15f, 1.0f, aVar.e), this.h.intValue()));
            v1Var.x = this.h;
            this.b.invalidate();
            textView.setTextColor(i0.a.d(aVar.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            int d10 = i0.a.d(aVar.e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.g6.w0(null, i11, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            textView.setTextColor(i0.a.d(aVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.a.center_color, 255), i0.a.k(this.v.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.g6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
