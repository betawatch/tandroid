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
import c8.ja;
import di.ub;
import hi.l3;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w1 extends LinearLayout implements z5 {
    public final /* synthetic */ int a = 0;
    public final e6 b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public w1(Activity activity, int i7, long j3, String str, e6 e6Var) {
        super(activity);
        setOrientation(1);
        this.b = e6Var;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        textView.setGravity(17);
        ub ubVar = new ub(activity, 2);
        this.d = ubVar;
        ubVar.setTextAlignment(4);
        ubVar.setGravity(17);
        ubVar.setTextSize(1, 12.0f);
        ubVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ubVar.setGravity(1);
        fh0 fh0Var = new fh0(activity);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ubVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            fh0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(hd.M0(2131742896, null));
            ubVar.setText(hd.M0(2131742897, null));
            ubVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(ubVar.getText(), ubVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            fh0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(hd.M0(2131752765, null));
            ubVar.setText(hd.M0(2131752766, null));
            ubVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(ubVar.getText(), ubVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            fh0Var.setImageResource(R.drawable.large_away);
            textView.setText(hd.M0(2131752833, null));
            ubVar.setText(hd.M0(2131752834, null));
            ubVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), l3.a(ubVar.getText(), ubVar.getPaint())));
        } else {
            if (i7 == 5) {
                fh0Var.setImageResource(R.drawable.large_quickreplies);
                u1 c10 = v1.f(m10.t0).c(j3);
                String str2 = c10 == null ? str : c10.b;
                textView.setText(hd.M0(2131752667, null));
                ubVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                ubVar.setTextAlignment(2);
                ubVar.setGravity(3);
                ubVar.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752669, str2)));
                ubVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                ub ubVar2 = new ub(activity, 2);
                this.e = ubVar2;
                ubVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                ubVar2.setTextAlignment(2);
                ubVar2.setGravity(3);
                ubVar2.setTextSize(1, 13.0f);
                ubVar2.setText(org.telegram.messenger.g0.X2(hd.M0(2131752668, null)));
                ubVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(fh0Var, ja.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, ja.t(-2, -2, 49, 20, 0, 20, 6));
        addView(ubVar, ja.t(-2, -2, 49, i11, 0, i11, ((ub) this.e) == null ? 19 : 9));
        View view = (ub) this.e;
        if (view != null) {
            addView(view, ja.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                break;
            default:
                hashSet.add(Integer.valueOf(j6.G6));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        switch (this.a) {
            case 0:
                ub ubVar = (ub) this.d;
                TextView textView = this.c;
                if (textView != null && ubVar != null) {
                    int i7 = j6.Zc;
                    e6 e6Var = this.b;
                    textView.setTextColor(j6.w0(i7, e6Var));
                    ubVar.setTextColor(j6.w0(i7, e6Var));
                    ub ubVar2 = (ub) this.e;
                    if (ubVar2 != null) {
                        ubVar2.setTextColor(j6.w0(i7, e6Var));
                        break;
                    }
                }
                break;
            default:
                ImageView imageView = (ImageView) this.d;
                int i10 = j6.G6;
                e6 e6Var2 = this.b;
                imageView.setColorFilter(new PorterDuffColorFilter(j6.w0(i10, e6Var2), PorterDuff.Mode.SRC_IN));
                this.c.setTextColor(j6.w0(i10, e6Var2));
                this.e.setTextColor(j6.r1(0.75f, j6.w0(i10, e6Var2)));
                break;
        }
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }

    public w1(Context context, oi.j0 j0Var, e6 e6Var) {
        super(context);
        this.b = e6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ja.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, ja.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), ja.p(0, -2, 1.0f, ns.E1));
        addView(textView2, ja.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(j0Var.a);
        textView.setText(j0Var.b);
        textView2.setText((CharSequence) j0Var.c.get(0));
        updateColors();
    }
}
