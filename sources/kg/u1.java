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
import bi.md;
import c8.ha;
import fi.m3;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u1 extends LinearLayout implements a6 {
    public final /* synthetic */ int a = 0;
    public final f6 b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public u1(Activity activity, int i7, long j3, String str, f6 f6Var) {
        super(activity);
        setOrientation(1);
        this.b = f6Var;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        md mdVar = new md(activity, 4);
        this.d = mdVar;
        mdVar.setTextAlignment(4);
        mdVar.setGravity(17);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        mdVar.setGravity(1);
        ch0 ch0Var = new ch0(activity);
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mdVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            ch0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(hd.M0(2131742897, null));
            mdVar.setText(hd.M0(2131742898, null));
            mdVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), m3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            ch0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(hd.M0(2131752765, null));
            mdVar.setText(hd.M0(2131752766, null));
            mdVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), m3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            ch0Var.setImageResource(R.drawable.large_away);
            textView.setText(hd.M0(2131752833, null));
            mdVar.setText(hd.M0(2131752834, null));
            mdVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), m3.a(mdVar.getText(), mdVar.getPaint())));
        } else {
            if (i7 == 5) {
                ch0Var.setImageResource(R.drawable.large_quickreplies);
                s1 c10 = t1.f(p10.s0).c(j3);
                String str2 = c10 == null ? str : c10.b;
                textView.setText(hd.M0(2131752667, null));
                mdVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                mdVar.setTextAlignment(2);
                mdVar.setGravity(3);
                mdVar.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752669, str2)));
                mdVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                md mdVar2 = new md(activity, 4);
                this.e = mdVar2;
                mdVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                mdVar2.setTextAlignment(2);
                mdVar2.setGravity(3);
                mdVar2.setTextSize(1, 13.0f);
                mdVar2.setText(org.telegram.messenger.g0.X2(hd.M0(2131752668, null)));
                mdVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(ch0Var, ha.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, ha.t(-2, -2, 49, 20, 0, 20, 6));
        addView(mdVar, ha.t(-2, -2, 49, i11, 0, i11, ((md) this.e) == null ? 19 : 9));
        View view = (md) this.e;
        if (view != null) {
            addView(view, ha.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                break;
            default:
                hashSet.add(Integer.valueOf(k6.G6));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        switch (this.a) {
            case 0:
                md mdVar = (md) this.d;
                TextView textView = this.c;
                if (textView != null && mdVar != null) {
                    int i7 = k6.Wc;
                    f6 f6Var = this.b;
                    textView.setTextColor(k6.w0(i7, f6Var));
                    mdVar.setTextColor(k6.w0(i7, f6Var));
                    md mdVar2 = (md) this.e;
                    if (mdVar2 != null) {
                        mdVar2.setTextColor(k6.w0(i7, f6Var));
                        break;
                    }
                }
                break;
            default:
                ImageView imageView = (ImageView) this.d;
                int i10 = k6.G6;
                f6 f6Var2 = this.b;
                imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(i10, f6Var2), PorterDuff.Mode.SRC_IN));
                this.c.setTextColor(k6.w0(i10, f6Var2));
                this.e.setTextColor(k6.r1(0.75f, k6.w0(i10, f6Var2)));
                break;
        }
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }

    public u1(Context context, li.l0 l0Var, f6 f6Var) {
        super(context);
        this.b = f6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ha.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, ha.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), ha.p(0, -2, 1.0f, qs.E1));
        addView(textView2, ha.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(l0Var.a);
        textView.setText(l0Var.b);
        textView2.setText((CharSequence) l0Var.c.get(0));
        updateColors();
    }
}
