package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.i1;
import com.google.android.gms.internal.play_billing.k3;
import hi.r0;
import hi.s0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;
import zf.g0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class g extends FrameLayout implements y5 {
    public static final /* synthetic */ int F = 0;
    public long E;
    public final d6 a;
    public final int b;
    public final w9 c;
    public final TextView d;
    public final w9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final yq r;
    public final gh.d s;
    public final dh.d v;
    public boolean w;
    public d x;
    public long y;

    public g(Context context, int i10, d6 d6Var) {
        super(context);
        bh.b bVar;
        this.a = d6Var;
        this.b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.s = dVar;
            dVar.i(AndroidUtilities.dp(7.0f), g0.a());
            dVar.h = true;
            bVar = new bh.b(dVar);
        } else {
            this.s = null;
            gh.c cVar = new gh.c();
            cVar.a(-16777216);
            bVar = new bh.b(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        w9 w9Var = new w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(w9Var, z5.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        yq yqVar = new yq(R.drawable.mini_user_channels_10, 0);
        this.r = yqVar;
        yqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, z5.e(-2, -1, 81));
        addView(frameLayout, z5.s(52, 48, 11, 48, 0, 14.33f, 0));
        dh.d c10 = bVar.c(textView, null, false);
        eh.e eVar = new eh.e(d6Var);
        eVar.e = new i1(23);
        eVar.d(1627389951, 1358954495);
        eVar.c(603979776, 603979776);
        eVar.b(0, 0);
        eVar.n = 0.0f;
        eVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(7.0f));
        this.v = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        w9 w9Var2 = new w9(context);
        this.e = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        final int i11 = 0;
        w9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ii.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g gVar = this.b;
                        d dVar2 = gVar.x;
                        if (dVar2 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar3 = gVar2.x;
                        if (dVar3 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar4 = gVar3.x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar5 = gVar4.x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        addView(w9Var2, z5.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        final int i12 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: ii.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g gVar = this.b;
                        d dVar2 = gVar.x;
                        if (dVar2 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar2).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar3 = gVar2.x;
                        if (dVar3 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar4 = gVar3.x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar5 = gVar4.x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView i13 = k3.i(linearLayout, textView3, z5.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = i13;
        i13.setTextSize(1, 13.0f);
        i13.setBackground(h6.c0(AndroidUtilities.dp(12.0f), h6.m1(0.14f, h6.w0(h6.D6, d6Var))));
        i13.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        i13.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        i13.setText(spannableStringBuilder);
        i13.setVisibility(8);
        linearLayout.addView(i13, z5.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        ei.d dVar2 = new ei.d(context, d6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.e();
        dVar2.d();
        dVar2.setColor(h6.m1(0.14f, h6.w0(h6.z6, d6Var)));
        dVar2.setTextColor(h6.x0(null, h6.G6, false));
        dVar2.g(LocaleController.getString(R.string.Decline), false, true);
        final int i14 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ii.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g gVar = this.b;
                        d dVar22 = gVar.x;
                        if (dVar22 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar22).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar3 = gVar2.x;
                        if (dVar3 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar3).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar4 = gVar3.x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar5 = gVar4.x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar2, z5.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        ei.d dVar3 = new ei.d(context, d6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.g(LocaleController.getString(R.string.Add), false, true);
        final int i15 = 3;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: ii.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        g gVar = this.b;
                        d dVar22 = gVar.x;
                        if (dVar22 != null) {
                            long j10 = gVar.E;
                            r0 r0Var = ((s0) dVar22).h;
                            if (r0Var != null) {
                                r0Var.j(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar32 = gVar2.x;
                        if (dVar32 != null) {
                            long j11 = gVar2.E;
                            r0 r0Var2 = ((s0) dVar32).h;
                            if (r0Var2 != null) {
                                r0Var2.j(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar4 = gVar3.x;
                        if (dVar4 != null) {
                            ((s0) dVar4).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar5 = gVar4.x;
                        if (dVar5 != null) {
                            ((s0) dVar5).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar3, z5.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, z5.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, z5.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        int i10 = h6.G6;
        d6 d6Var = this.a;
        this.f.setTextColor(h6.w0(i10, d6Var));
        int i11 = h6.z6;
        this.h.setTextColor(h6.w0(i11, d6Var));
        this.n.setTextColor(h6.w0(i11, d6Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, h6.k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gh.d dVar;
        w9 w9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.s) != null && view == (w9Var = this.c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = w9Var.getLeft() - dp;
            int top = w9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(h6.w0(h6.d6, this.a));
            a2.save();
            float f7 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f7, f7);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(TLObject.FLAG_29);
            dVar.c();
        }
        return super.drawChild(canvas, view, j10);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.t(AndroidUtilities.dp(9.0f) + this.d.getLeft(), AndroidUtilities.dp(48.0f));
    }
}
