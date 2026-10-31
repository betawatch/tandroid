package org.telegram.ui.Wallet;

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
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Components.g9 b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public Drawable h;
    public ShapeDrawable n;
    public int r;

    public c(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(8.0f));
        addView(g9Var, w7.b6.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, w7.b6.d(-1, -1.0f, zs.E1, 71.0f, 0.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        linearLayout.addView(textView, w7.b6.o(-1, 20));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        textView2.setGravity(16);
        textView2.setTextSize(1, 14.0f);
        linearLayout.addView(textView2, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 18));
        updateColors();
    }

    public static String b(TL_wallet.nftItem nftitem, String str) {
        ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_wallet.nftAttribute nftattribute = arrayList.get(i10);
            i10++;
            TL_wallet.nftAttribute nftattribute2 = nftattribute;
            if (TextUtils.equals(nftattribute2.trait_type, str)) {
                return nftattribute2.value;
            }
        }
        return null;
    }

    public static ic c(TL_wallet.nftItem nftitem, boolean z10) {
        TLRPC.WebDocument webDocument;
        if ((!z10 || (webDocument = nftitem.image_small) == null) && (webDocument = nftitem.image) == null) {
            webDocument = nftitem.image_small;
        }
        if (webDocument == null) {
            return null;
        }
        return ic.p(b30.c(webDocument));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrid(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        FrameLayout.LayoutParams d = z10 ? w7.b6.d(-1, -1.0f, zs.E1, 3.33f, 4.0f, 3.33f, 4.0f) : w7.b6.d(46, 46.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f);
        org.telegram.ui.Components.g9 g9Var = this.b;
        g9Var.setLayoutParams(d);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(z10 ? 11.0f : 8.0f));
        ((View) this.c.getParent()).setVisibility(z10 ? 8 : 0);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int w02;
        super.onDraw(canvas);
        if (this.h != null && this.n != null && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, this.a)) != this.r) {
            this.r = w02;
            this.h.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.r1(0.1f, w02), this.n);
            org.telegram.ui.Components.g9 g9Var = this.b;
            if (g9Var != null) {
                g9Var.invalidate();
            }
        }
        if (this.e) {
            canvas.drawRect(cd.X ? 0.0f : org.telegram.messenger.i0.L(71.0f), getHeight() - 1, getWidth() - (cd.X ? org.telegram.messenger.i0.L(71.0f) : 0), getHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f ? 112.0f : 58.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        setBackgroundColor(0);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
    }
}
