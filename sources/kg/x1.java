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
import c8.na;
import di.xb;
import hi.u3;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x1 extends LinearLayout implements c6 {
    public final /* synthetic */ int a = 0;
    public final i6 b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public x1(Activity activity, int i7, long j3, String str, i6 i6Var) {
        super(activity);
        setOrientation(1);
        this.b = i6Var;
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
        qh0 qh0Var = new qh0(activity);
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        xbVar.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
        int i10 = 22;
        if (i7 == 9) {
            qh0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(gd.N0(2131742625, null));
            xbVar.setText(gd.N0(2131742626, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), u3.a(xbVar.getText(), xbVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            qh0Var.setImageResource(R.drawable.large_greeting);
            textView.setText(gd.N0(2131752753, null));
            xbVar.setText(gd.N0(2131752754, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), u3.a(xbVar.getText(), xbVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            qh0Var.setImageResource(R.drawable.large_away);
            textView.setText(gd.N0(2131752821, null));
            xbVar.setText(gd.N0(2131752822, null));
            xbVar.setMaxWidth(Math.min(org.telegram.messenger.g0.L(160.0f), u3.a(xbVar.getText(), xbVar.getPaint())));
        } else {
            if (i7 == 5) {
                qh0Var.setImageResource(R.drawable.large_quickreplies);
                v1 c10 = w1.f(i10.t0).c(j3);
                String str2 = c10 == null ? str : c10.b;
                textView.setText(gd.N0(2131752655, null));
                xbVar.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                xbVar.setTextAlignment(2);
                xbVar.setGravity(3);
                xbVar.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752657, str2)));
                xbVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
                xb xbVar2 = new xb(activity, 2);
                this.e = xbVar2;
                xbVar2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                xbVar2.setTextAlignment(2);
                xbVar2.setGravity(3);
                xbVar2.setTextSize(1, 13.0f);
                xbVar2.setText(org.telegram.messenger.g0.W2(gd.N0(2131752656, null)));
                xbVar2.setPadding(org.telegram.messenger.g0.L(28.0f), 0, 0, 0);
            }
            i10 = 12;
        }
        int i11 = i10;
        addView(qh0Var, na.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, na.t(-2, -2, 49, 20, 0, 20, 6));
        addView(xbVar, na.t(-2, -2, 49, i11, 0, i11, ((xb) this.e) == null ? 19 : 9));
        View view = (xb) this.e;
        if (view != null) {
            addView(view, na.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                break;
            default:
                hashSet.add(Integer.valueOf(n6.G6));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        switch (this.a) {
            case 0:
                xb xbVar = (xb) this.d;
                TextView textView = this.c;
                if (textView != null && xbVar != null) {
                    int i7 = n6.Zc;
                    i6 i6Var = this.b;
                    textView.setTextColor(n6.w0(i7, i6Var));
                    xbVar.setTextColor(n6.w0(i7, i6Var));
                    xb xbVar2 = (xb) this.e;
                    if (xbVar2 != null) {
                        xbVar2.setTextColor(n6.w0(i7, i6Var));
                        break;
                    }
                }
                break;
            default:
                ImageView imageView = (ImageView) this.d;
                int i10 = n6.G6;
                i6 i6Var2 = this.b;
                imageView.setColorFilter(new PorterDuffColorFilter(n6.w0(i10, i6Var2), PorterDuff.Mode.SRC_IN));
                this.c.setTextColor(n6.w0(i10, i6Var2));
                this.e.setTextColor(n6.r1(0.75f, n6.w0(i10, i6Var2)));
                break;
        }
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }

    public x1(Context context, oi.k0 k0Var, i6 i6Var) {
        super(context);
        this.b = i6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, na.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, na.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), na.p(0, -2, 1.0f, ks.E1));
        addView(textView2, na.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.a);
        textView.setText(k0Var.b);
        textView2.setText((CharSequence) k0Var.c.get(0));
        updateColors();
    }
}
