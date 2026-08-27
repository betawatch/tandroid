package hh;

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
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j1 extends FrameLayout implements ud.b {
    public final org.telegram.ui.ActionBar.c6 a;
    public final FrameLayout b;
    public final gh.y1 c;
    public final org.telegram.ui.Components.n9 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final ud.a r;
    public boolean s;
    public g1 v;

    public j1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = new ud.a(0, this, er.h, 320L, false);
        this.a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        gh.y1 y1Var = new gh.y1(frameLayout, c6Var, true);
        this.c = y1Var;
        frameLayout.setBackground(y1Var);
        y1Var.v = 1;
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.getImageReceiver().setAutoRepeat(0);
        addView(n9Var, h7.z5.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, h7.z5.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, h7.z5.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(j1 j1Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        org.telegram.ui.Components.n9 n9Var = j1Var.d;
        if (document == null) {
            n9Var.b();
            j1Var.n = null;
            return;
        }
        if (j1Var.n == document) {
            return;
        }
        j1Var.n = document;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.a7, 0.3f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i10);
        sb2.append(z10 ? "_nolimit_pcache" : "");
        String sb3 = sb2.toString();
        n9Var.setLayoutParams(h7.z5.d(i10, i10, 49, 0.0f, r3 + 17, 0.0f, (80 - i10) / 2));
        n9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
    }

    public final void b() {
        int d;
        gh.y1 y1Var = this.c;
        y1Var.x = null;
        Integer num = this.h;
        ud.a aVar = this.r;
        TextView textView = this.f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.l1(AndroidUtilities.lerp(0.15f, 1.0f, aVar.e), this.h.intValue()));
            y1Var.x = this.h;
            this.b.invalidate();
            textView.setTextColor(i0.b.d(aVar.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            int d10 = i0.b.d(aVar.e, i0.b.d(0.05f, w02, org.telegram.ui.ActionBar.g6.w0(null, i11, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            textView.setTextColor(i0.b.d(aVar.e, i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.b.d(0.5f, i0.b.k(this.v.a.center_color, 255), i0.b.k(this.v.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.g6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        b();
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
