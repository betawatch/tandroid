// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hm2 extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public Drawable h;
    public ShapeDrawable n;
    public int r;

    public hm2(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setWillNotDraw(false);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(8.0f));
        addView(bf0Var, qoe.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, qoe.d(-1, -1.0f, nm7.D1, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gm.n1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, qoe.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i);
            i++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static gn5 c(TL_wallet.nftItem nftitem, boolean z) {
        TLRPC.WebDocument webDocument;
        if ((!z || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return gn5.p(vuc.c(webDocument));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrid(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        FrameLayout.LayoutParams d = z ? qoe.d(-1, -1.0f, nm7.D1, 3.33f, 4.0f, 3.33f, 4.0f) : qoe.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        bf0 bf0Var = this.b;
        bf0Var.setLayoutParams(d);
        bf0Var.setRoundRadius(gm.L(z ? 11.0f : 8.0f));
        ((View) this.c.getParent()).setVisibility(z ? 8 : 0);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int v0;
        super.onDraw(canvas);
        if (this.h != null && this.n != null && (v0 = cmb.v0(cmb.x6, this.a)) != this.r) {
            this.r = v0;
            this.h.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            cmb.A1(cmb.p1(0.1f, v0), this.n);
            bf0 bf0Var = this.b;
            if (bf0Var != null) {
                bf0Var.invalidate();
            }
        }
        if (this.e) {
            canvas.drawRect(jb6.a0 ? 0.0f : gm.L(71.0f), getHeight() - 1, getWidth() - (jb6.a0 ? gm.L(71.0f) : 0), getHeight(), cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.f ? 112.0f : 58.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        setBackgroundColor(0);
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.c.setTextColor(cmb.v0(i, ylbVar));
        this.d.setTextColor(cmb.v0(cmb.y6, ylbVar));
    }
}
