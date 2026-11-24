// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gk8 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final w94 d;
    public final ub8 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        boolean z = premiumPreviewFragment.h0;
        int i = z ? nm7.E2 : nm7.T2;
        addView(frameLayout, qoe.r(i, i, 1));
        w94 w94Var = new w94(this, context, premiumPreviewFragment.i0 ? 1 : 0, z ? 1 : 0, context);
        this.d = w94Var;
        frameLayout.addView(w94Var, qoe.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        addView(textView, qoe.q(-2, -2, 0.0f, 1, 16, z ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, qoe.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        ub8 ub8Var = new ub8(this, context);
        this.e = ub8Var;
        ub8Var.setOverScrollMode(2);
        ub8Var.setLayoutManager(new u46());
        ub8Var.setAdapter(new fk8(this, context));
        ub8Var.setOnItemClickListener(new kg4(this, (byte) 23));
        ub8Var.setSelectorTransformer(new cw0(this, new Path(), new float[8], (byte) 2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(ub8Var, qoe.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
    
        if (j$.util.Objects.equals(r5, (r7 == null || (r7 = r7.transaction) == null) ? null : r7.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1")) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00cc, code lost:
    
        r2.clear();
        r1.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ca, code lost:
    
        if (r5.a.months == 12) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        arrayList.clear();
        premiumPreviewFragment.e = -1;
        premiumPreviewFragment.f = null;
        if (premiumPreviewFragment.getMediaDataController().E != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = premiumPreviewFragment.getMediaDataController().E.period_options;
            int size = arrayList2.size();
            int i = 0;
            j = 0;
            while (i < size) {
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i);
                i++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
                if (premiumPreviewFragment.getUserConfig().p() && !tL_premiumSubscriptionOption2.can_purchase_upgrade && !tL_premiumSubscriptionOption2.current) {
                }
                ik8 ik8Var = new ik8(tL_premiumSubscriptionOption2);
                arrayList.add(ik8Var);
                if (premiumPreviewFragment.k0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = ik8Var;
                }
                if (e21.b() && ik8Var.i() > j) {
                    j = ik8Var.i();
                }
            }
        } else {
            j = 0;
        }
        if (e21.b() && premiumPreviewFragment.getUserConfig().p()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!e21.b() && premiumPreviewFragment.f != null) {
                String str = cj0.h().e;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            ik8 ik8Var2 = premiumPreviewFragment.f;
            if (ik8Var2 != null) {
            }
        }
        if (e21.b()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ik8) obj).e = j;
            }
        } else if (cj0.h().j() && cj0.l != null) {
            int size3 = arrayList.size();
            boolean z = false;
            int i3 = 0;
            long j2 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList.get(i3);
                i3++;
                ik8 ik8Var3 = (ik8) obj2;
                ik8Var3.f = cj0.l;
                if (ik8Var3.i() > j2) {
                    j2 = ik8Var3.i();
                }
                ik8Var3.a();
                if (ik8Var3.g != null) {
                    z = true;
                }
            }
            if (z) {
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    ik8 ik8Var4 = (ik8) arrayList.get(i4);
                    ik8Var4.a();
                    if (ik8Var4.g == null) {
                        arrayList.remove(i4);
                        i4--;
                    }
                    i4++;
                }
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj3 = arrayList.get(i5);
                i5++;
                ((ik8) obj3).e = j2;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                if (((ik8) arrayList.get(i6)).a.months == 12) {
                    premiumPreviewFragment.e = i6;
                    break;
                }
                i6++;
            }
            if (premiumPreviewFragment.e == -1) {
                premiumPreviewFragment.e = 0;
            }
        }
        premiumPreviewFragment.y0(false);
        this.e.getAdapter().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        boolean z2;
        ub8 ub8Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        boolean z3 = premiumPreviewFragment.h0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (!z3) {
            textView.setText(jb6.M0(premiumPreviewFragment.q0 ? 2131743913 : 2131743916, null));
            textView2.setText(gm.S2(jb6.M0((premiumPreviewFragment.getUserConfig().p() || premiumPreviewFragment.q0) ? 2131743914 : 2131743912, null)));
        } else if (z3) {
            textView.setText(jb6.M0(premiumPreviewFragment.q0 ? 2131743913 : 2131743937, null));
            textView2.setText(gm.S2(jb6.M0((premiumPreviewFragment.getUserConfig().p() || premiumPreviewFragment.q0) ? 2131743935 : 2131743932, null)));
        }
        textView2.getLayoutParams().width = Math.min(gm.q.x - gm.L(42.0f), hg5.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.q0) {
            boolean z4 = e21.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z = false;
                z2 = this.f;
                ub8Var = this.e;
                if (z2 || !z) {
                    ub8Var.setVisibility(z ? 8 : 0);
                    this.f = true;
                } else if (ub8Var.getVisibility() == 0 && z && this.h == z) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new nl(this, ub8Var, duration, (byte) 5));
                    duration.addListener(new ic8((Object) this, (Object) ub8Var, (byte) 3));
                    duration.setInterpolator(d53.f);
                    duration.start();
                }
                this.h = !z;
            }
        }
        z = true;
        z2 = this.f;
        ub8Var = this.e;
        if (z2) {
        }
        ub8Var.setVisibility(z ? 8 : 0);
        this.f = true;
        this.h = !z;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
