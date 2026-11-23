package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import c8.ma;
import di.xb;
import hi.l3;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class w1 extends LinearLayout implements b6 {
    public final /* synthetic */ int a = 0;
    public final h6 b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public w1(Activity activity, int i7, long j3, String str, h6 h6Var) {
        super(activity);
        setOrientation(1);
        this.b = h6Var;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        xb xbVar = new xb(activity, 2);
        this.d = xbVar;
        xbVar.setTextAlignment(4);
        xbVar.setGravity(17);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        xbVar.setGravity(1);
        rh0 rh0Var = new rh0(activity);
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        xbVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            rh0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(hd.N0(2131742630, null));
            xbVar.setText(hd.N0(2131742631, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(xbVar.getText(), xbVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            rh0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(hd.N0(2131752753, null));
            xbVar.setText(hd.N0(2131752754, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(xbVar.getText(), xbVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            rh0Var.setImageResource(R.drawable.large_away);
            textView.setText(hd.N0(2131752821, null));
            xbVar.setText(hd.N0(2131752822, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(xbVar.getText(), xbVar.getPaint())));
        } else {
            if (i7 == 5) {
                rh0Var.setImageResource(R.drawable.large_quickreplies);
                u1 c10 = v1.f(k10.t0).c(j3);
                String str2 = c10 == null ? str : c10.b;
                textView.setText(hd.N0(2131752655, null));
                xbVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                xbVar.setTextAlignment(2);
                xbVar.setGravity(3);
                xbVar.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752657, str2)));
                xbVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                xb xbVar2 = new xb(activity, 2);
                this.e = xbVar2;
                xbVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                xbVar2.setTextAlignment(2);
                xbVar2.setGravity(3);
                xbVar2.setTextSize(1, 13.0f);
                xbVar2.setText(org.telegram.messenger.g0.W2(hd.N0(2131752656, null)));
                xbVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(rh0Var, ma.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, ma.t(-2, -2, 49, 20, 0, 20, 6));
        addView(xbVar, ma.t(-2, -2, 49, i11, 0, i11, ((xb) this.e) == null ? 19 : 9));
        View view = (xb) this.e;
        if (view != null) {
            addView(view, ma.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                break;
            default:
                hashSet.add(Integer.valueOf(m6.G6));
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        switch (this.a) {
            case 0:
                xb xbVar = (xb) this.d;
                TextView textView = this.c;
                if (textView != null && xbVar != null) {
                    int i7 = m6.Zc;
                    h6 h6Var = this.b;
                    textView.setTextColor(m6.w0(i7, h6Var));
                    xbVar.setTextColor(m6.w0(i7, h6Var));
                    xb xbVar2 = (xb) this.e;
                    if (xbVar2 != null) {
                        xbVar2.setTextColor(m6.w0(i7, h6Var));
                        break;
                    }
                }
                break;
            default:
                ImageView imageView = (ImageView) this.d;
                int i10 = m6.G6;
                h6 h6Var2 = this.b;
                imageView.setColorFilter(new PorterDuffColorFilter(m6.w0(i10, h6Var2), PorterDuff.Mode.SRC_IN));
                this.c.setTextColor(m6.w0(i10, h6Var2));
                this.e.setTextColor(m6.r1(0.75f, m6.w0(i10, h6Var2)));
                break;
        }
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }

    public w1(Context context, oi.k0 k0Var, h6 h6Var) {
        super(context);
        this.b = h6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ma.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, ma.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), ma.p(0, -2, 1.0f, ls.E1));
        addView(textView2, ma.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.a);
        textView.setText(k0Var.b);
        textView2.setText((CharSequence) k0Var.c.get(0));
        updateColors();
    }
}
