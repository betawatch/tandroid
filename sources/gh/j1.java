package gh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j1 extends FrameLayout implements td.b {
    public final org.telegram.ui.ActionBar.b6 a;
    public final FrameLayout b;
    public final fh.b2 c;
    public final org.telegram.ui.Components.o9 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final td.a r;
    public boolean s;
    public g1 v;

    public j1(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.r = new td.a(0, this, gr.h, 320L, false);
        this.a = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        fh.b2 b2Var = new fh.b2(frameLayout, b6Var, true);
        this.c = b2Var;
        frameLayout.setBackground(b2Var);
        b2Var.v = 1;
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.getImageReceiver().setAutoRepeat(0);
        addView(o9Var, g7.e6.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, g7.e6.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, g7.e6.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(j1 j1Var, TLRPC.Document document, int i9, Object obj, boolean z10) {
        org.telegram.ui.Components.o9 o9Var = j1Var.d;
        if (document == null) {
            o9Var.b();
            j1Var.n = null;
            return;
        }
        if (j1Var.n == document) {
            return;
        }
        j1Var.n = document;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.a7, 0.3f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i9);
        sb2.append("_");
        sb2.append(i9);
        sb2.append(z10 ? "_nolimit_pcache" : "");
        String sb3 = sb2.toString();
        o9Var.setLayoutParams(g7.e6.d(i9, i9, 49, 0.0f, r3 + 17, 0.0f, (80 - i9) / 2));
        o9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b();
    }

    public final void b() {
        int d;
        fh.b2 b2Var = this.c;
        b2Var.x = null;
        Integer num = this.h;
        td.a aVar = this.r;
        TextView textView = this.f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), org.telegram.ui.ActionBar.f6.l1(AndroidUtilities.lerp(0.15f, 1.0f, aVar.e), this.h.intValue()));
            b2Var.x = this.h;
            this.b.invalidate();
            textView.setTextColor(i0.a.d(aVar.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i9 = org.telegram.ui.ActionBar.f6.d6;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            int d9 = i0.a.d(aVar.e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.f6.w0(null, i10, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
            textView.setTextColor(i0.a.d(aVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false)), -1));
            d = d9;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.a.center_color, 255), i0.a.k(this.v.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.f6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
