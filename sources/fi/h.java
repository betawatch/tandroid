package fi;

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
import com.google.android.gms.internal.vision.e2;
import ei.s0;
import ei.t0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w9;
import xf.g0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements a6 {
    public static final /* synthetic */ int F = 0;
    public long E;
    public final f6 a;
    public final int b;
    public final w9 c;
    public final TextView d;
    public final w9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final uq r;
    public final eh.d s;
    public final bh.d v;
    public boolean w;
    public e x;
    public long y;

    public h(Context context, int i10, f6 f6Var) {
        super(context);
        zg.a aVar;
        this.a = f6Var;
        this.b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            eh.d dVar = new eh.d(null);
            this.s = dVar;
            dVar.h(AndroidUtilities.dp(7.0f), g0.a());
            dVar.h = true;
            aVar = new zg.a(dVar);
        } else {
            this.s = null;
            eh.c cVar = new eh.c();
            cVar.a(-16777216);
            aVar = new zg.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        w9 w9Var = new w9(context);
        this.c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(w9Var, w7.a6.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        uq uqVar = new uq(R.drawable.mini_user_channels_10, 0);
        this.r = uqVar;
        uqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, w7.a6.e(-2, -1, 81));
        addView(frameLayout, w7.a6.s(52, 48, 11, 48, 0, 14.33f, 0));
        bh.d c10 = aVar.c(textView, null, false);
        ch.e eVar = new ch.e(f6Var);
        eVar.e = new dh.a(0);
        eVar.d(1627389951, 1358954495);
        eVar.c(603979776, 603979776);
        eVar.b(0, 0);
        eVar.n = 0.0f;
        eVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        c10.n(eVar);
        c10.p(AndroidUtilities.dp(7.0f));
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
        linearLayout.addView(textView2, w7.a6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        w9 w9Var2 = new w9(context);
        this.e = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        final int i11 = 0;
        w9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.v(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.v(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        addView(w9Var2, w7.a6.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        final int i12 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.v(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.v(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView g10 = e2.g(linearLayout, textView3, w7.a6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = g10;
        g10.setTextSize(1, 13.0f);
        g10.setBackground(j6.b0(AndroidUtilities.dp(12.0f), j6.l1(0.14f, j6.v0(j6.D6, f6Var))));
        g10.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        g10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new uq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        g10.setText(spannableStringBuilder);
        g10.setVisibility(8);
        linearLayout.addView(g10, w7.a6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        bi.d dVar2 = new bi.d(context, f6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar2.e();
        dVar2.d();
        dVar2.setColor(j6.l1(0.14f, j6.v0(j6.z6, f6Var)));
        dVar2.setTextColor(j6.w0(null, j6.G6, false));
        dVar2.g(LocaleController.getString(R.string.Decline), false, true);
        final int i13 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.v(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.v(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar2, w7.a6.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        bi.d dVar3 = new bi.d(context, f6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.g(LocaleController.getString(R.string.Add), false, true);
        final int i14 = 3;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: fi.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.x;
                        if (eVar2 != null) {
                            long j3 = hVar.E;
                            s0 s0Var = ((t0) eVar2).h;
                            if (s0Var != null) {
                                s0Var.v(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.x;
                        if (eVar3 != null) {
                            long j10 = hVar2.E;
                            s0 s0Var2 = ((t0) eVar3).h;
                            if (s0Var2 != null) {
                                s0Var2.v(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.x;
                        if (eVar4 != null) {
                            ((t0) eVar4).g(hVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.x;
                        if (eVar5 != null) {
                            ((t0) eVar5).g(hVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar3, w7.a6.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, w7.a6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, w7.a6.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, j6.k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        eh.d dVar;
        w9 w9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.s) != null && view == (w9Var = this.c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = w9Var.getLeft() - dp;
            int top = w9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(j6.v0(j6.d6, this.a));
            a2.save();
            float f7 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f7, f7);
            super.drawChild(a2, view, j3);
            a2.restore();
            a2.drawColor(TLObject.FLAG_29);
            dVar.c();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.a;
        this.f.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.z6;
        this.h.setTextColor(j6.v0(i11, f6Var));
        this.n.setTextColor(j6.v0(i11, f6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.s(AndroidUtilities.dp(9.0f) + this.d.getLeft(), AndroidUtilities.dp(48.0f));
    }
}
