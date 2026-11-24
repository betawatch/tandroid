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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ei8 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final n84 d;
    public final t98 e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ PremiumPreviewFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        boolean z = premiumPreviewFragment.h0;
        int i = z ? kk7.E2 : kk7.T2;
        addView(frameLayout, nme.r(i, i, 1));
        n84 n84Var = new n84(this, context, premiumPreviewFragment.i0 ? 1 : 0, z ? 1 : 0, context);
        this.d = n84Var;
        frameLayout.addView(n84Var, nme.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        addView(textView, nme.q(-2, -2, 0.0f, 1, 16, z ? 8 : 20, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, nme.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        t98 t98Var = new t98(this, context);
        this.e = t98Var;
        t98Var.setOverScrollMode(2);
        t98Var.setLayoutManager(new t26());
        t98Var.setAdapter(new di8(this, context));
        t98Var.setOnItemClickListener(new bf4(this, (byte) 22));
        t98Var.setSelectorTransformer(new su0(this, new Path(), new float[8], (byte) 2));
        setClipChildren(false);
        setClipToPadding(false);
        addView(t98Var, nme.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
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
                gi8 gi8Var = new gi8(tL_premiumSubscriptionOption2);
                arrayList.add(gi8Var);
                if (premiumPreviewFragment.k0 && tL_premiumSubscriptionOption2.months == 12) {
                    premiumPreviewFragment.e = arrayList.size() - 1;
                }
                if (tL_premiumSubscriptionOption2.current) {
                    premiumPreviewFragment.f = gi8Var;
                }
                if (w01.b() && gi8Var.i() > j) {
                    j = gi8Var.i();
                }
            }
        } else {
            j = 0;
        }
        if (w01.b() && premiumPreviewFragment.getUserConfig().p()) {
            arrayList.clear();
            premiumPreviewFragment.f = null;
        } else {
            if (!w01.b() && premiumPreviewFragment.f != null) {
                String str = ci0.h().e;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = premiumPreviewFragment.f.a;
            }
            gi8 gi8Var2 = premiumPreviewFragment.f;
            if (gi8Var2 != null) {
            }
        }
        if (w01.b()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                ((gi8) obj).e = j;
            }
        } else if (ci0.h().j() && ci0.l != null) {
            int size3 = arrayList.size();
            boolean z = false;
            int i3 = 0;
            long j2 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList.get(i3);
                i3++;
                gi8 gi8Var3 = (gi8) obj2;
                gi8Var3.f = ci0.l;
                if (gi8Var3.i() > j2) {
                    j2 = gi8Var3.i();
                }
                gi8Var3.a();
                if (gi8Var3.g != null) {
                    z = true;
                }
            }
            if (z) {
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    gi8 gi8Var4 = (gi8) arrayList.get(i4);
                    gi8Var4.a();
                    if (gi8Var4.g == null) {
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
                ((gi8) obj3).e = j2;
            }
        }
        if (premiumPreviewFragment.e == -1) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                if (((gi8) arrayList.get(i6)).a.months == 12) {
                    premiumPreviewFragment.e = i6;
                    break;
                }
                i6++;
            }
            if (premiumPreviewFragment.e == -1) {
                premiumPreviewFragment.e = 0;
            }
        }
        premiumPreviewFragment.x0(false);
        this.e.getAdapter().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        boolean z2;
        t98 t98Var;
        PremiumPreviewFragment premiumPreviewFragment = this.n;
        boolean z3 = premiumPreviewFragment.h0;
        TextView textView = this.a;
        TextView textView2 = this.b;
        if (!z3) {
            textView.setText(k96.M0(premiumPreviewFragment.q0 ? 2131743987 : 2131743990, null));
            textView2.setText(gl.T2(k96.M0((premiumPreviewFragment.getUserConfig().p() || premiumPreviewFragment.q0) ? 2131743988 : 2131743986, null)));
        } else if (z3) {
            textView.setText(k96.M0(premiumPreviewFragment.q0 ? 2131743987 : 2131744011, null));
            textView2.setText(gl.T2(k96.M0((premiumPreviewFragment.getUserConfig().p() || premiumPreviewFragment.q0) ? 2131744009 : 2131744006, null)));
        }
        textView2.getLayoutParams().width = Math.min(gl.q.x - gl.L(42.0f), je5.a(textView2.getText(), textView2.getPaint()));
        if (!premiumPreviewFragment.q0) {
            boolean z4 = w01.a;
            if (premiumPreviewFragment.d.size() > 1) {
                z = false;
                z2 = this.f;
                t98Var = this.e;
                if (z2 || !z) {
                    t98Var.setVisibility(z ? 8 : 0);
                    this.f = true;
                } else if (t98Var.getVisibility() == 0 && z && this.h == z) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    duration.addUpdateListener(new nk(this, t98Var, duration, (byte) 5));
                    duration.addListener(new eh8((Object) this, (Object) t98Var, (byte) 2));
                    duration.setInterpolator(s33.f);
                    duration.start();
                }
                this.h = !z;
            }
        }
        z = true;
        z2 = this.f;
        t98Var = this.e;
        if (z2) {
        }
        t98Var.setVisibility(z ? 8 : 0);
        this.f = true;
        this.h = !z;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
