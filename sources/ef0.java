// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ef0 implements Runnable {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ Object c;

    public ef0(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
        this.b = -1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int currentPage;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                hf0 hf0Var = (hf0) obj;
                if (hf0Var.a && hf0Var.getParent() != null && this.b == hf0Var.c) {
                    hf0Var.a = false;
                    if (hf0Var.r()) {
                        try {
                            hf0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        hf0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        break;
                    }
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null && (currentPage = wx1Var.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z = chatActivityEnterView.n4;
                    boolean z2 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.n4 = z2;
                    boolean z3 = chatActivityEnterView.o4;
                    chatActivityEnterView.o4 = currentPage == 0;
                    if (chatActivityEnterView.p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.O1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.O();
                        } else if (!z2) {
                            chatActivityEnterView.P1(false, true, false, true);
                        }
                    }
                    if (z != chatActivityEnterView.n4 || z3 != chatActivityEnterView.o4) {
                        chatActivityEnterView.N(true);
                        break;
                    }
                }
                break;
            case 2:
                int i = this.b;
                xd2 xd2Var = (xd2) obj;
                d49 layoutManager = xd2Var.v1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i > xd2Var.J1 ? Math.min(i + 1, xd2Var.q1.d.size() - 1) : Math.max(i - 1, 0);
                    sd2 sd2Var = xd2Var.A1;
                    sd2Var.a = min;
                    layoutManager.v0(sd2Var);
                }
                xd2Var.J1 = i;
                break;
            case 3:
                int i2 = this.b;
                tv7 tv7Var = (tv7) obj;
                if (((ef0) tv7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) tv7Var.b).get(i2);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) tv7Var.c).get(i2);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    tv7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) tv7Var.e).playTogether(arrayList);
                    ((AnimatorSet) tv7Var.e).addListener(new v85(this, (byte) 26));
                    ((AnimatorSet) tv7Var.e).start();
                    break;
                }
                break;
            case 4:
                lba lbaVar = (lba) obj;
                if (lbaVar.a && lbaVar.getParent() != null && this.b == lbaVar.c) {
                    lbaVar.a = false;
                    try {
                        lbaVar.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i3 = lbaVar.h;
                    if (i3 >= 0) {
                        lbaVar.y.c(((CharSequence) lbaVar.F.get(i3)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    lbaVar.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
            case 5:
                ((u1d) obj).b(this.b);
                break;
            default:
                ((ygf) obj).H.b(this.b);
                break;
        }
    }

    public /* synthetic */ ef0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ ef0(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }
}
