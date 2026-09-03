package eg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ j c;

    public /* synthetic */ a0(c1 c1Var, j jVar, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q0(this.c);
                break;
            default:
                final c1 c1Var = this.b;
                LinearLayout linearLayout = new LinearLayout(c1Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(c1Var.getContext());
                int i10 = k6.E8;
                f0 f0Var = c1Var.N1;
                textView.setTextColor(k6.v0(i10, f0Var));
                textView.setBackground(k6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final int i11 = 0;
                final j jVar = this.c;
                textView.setOnClickListener(new View.OnClickListener() { // from class: eg.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                j jVar2 = jVar;
                                c1 c1Var2 = c1Var;
                                c1Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.p1 p1Var = c1Var2.O1;
                                if (p1Var != null && p1Var.isShowing()) {
                                    c1Var2.O1.d(true);
                                    break;
                                }
                                break;
                            default:
                                c1 c1Var3 = c1Var;
                                c1Var3.getClass();
                                ((p3) jVar).r(true);
                                org.telegram.ui.ActionBar.p1 p1Var2 = c1Var3.O1;
                                if (p1Var2 != null && p1Var2.isShowing()) {
                                    c1Var3.O1.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, c6.n(-2, 48));
                if (jVar instanceof z3) {
                    TextView textView2 = new TextView(c1Var.getContext());
                    textView2.setTextColor(k6.v0(i10, f0Var));
                    textView2.setBackground(k6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(c1Var, 2));
                    linearLayout.addView(textView2, c6.n(-2, 48));
                }
                if (jVar instanceof p3) {
                    TextView textView3 = new TextView(c1Var.getContext());
                    textView3.setTextColor(k6.v0(i10, f0Var));
                    textView3.setBackgroundDrawable(k6.K0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    final int i12 = 1;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: eg.t
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    j jVar2 = jVar;
                                    c1 c1Var2 = c1Var;
                                    c1Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.p1 p1Var = c1Var2.O1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        c1Var2.O1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    c1 c1Var3 = c1Var;
                                    c1Var3.getClass();
                                    ((p3) jVar).r(true);
                                    org.telegram.ui.ActionBar.p1 p1Var2 = c1Var3.O1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        c1Var3.O1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c6.n(-2, 48));
                }
                if (!(jVar instanceof t2)) {
                    TextView textView4 = new TextView(c1Var.getContext());
                    textView4.setTextColor(k6.v0(i10, f0Var));
                    textView4.setBackgroundDrawable(k6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(c1Var, 3));
                    linearLayout.addView(textView4, c6.n(-2, 48));
                }
                c1Var.P1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
