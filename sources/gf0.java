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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gf0 implements Runnable {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ Object c;

    public gf0(ChatActivityEnterView chatActivityEnterView) {
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
                jf0 jf0Var = (jf0) obj;
                if (jf0Var.a && jf0Var.getParent() != null && this.b == jf0Var.c) {
                    jf0Var.a = false;
                    if (jf0Var.q()) {
                        try {
                            jf0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        jf0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        break;
                    }
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null && (currentPage = my1Var.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z = chatActivityEnterView.m4;
                    boolean z2 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.m4 = z2;
                    boolean z3 = chatActivityEnterView.n4;
                    chatActivityEnterView.n4 = currentPage == 0;
                    if (chatActivityEnterView.o4) {
                        if (chatActivityEnterView.G2 != 0) {
                            chatActivityEnterView.Z1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.Q();
                        } else if (!z2) {
                            chatActivityEnterView.a2(false, true, false, true);
                        }
                    }
                    if (z != chatActivityEnterView.m4 || z3 != chatActivityEnterView.n4) {
                        chatActivityEnterView.P(true);
                        break;
                    }
                }
                break;
            case 2:
                int i = this.b;
                oe2 oe2Var = (oe2) obj;
                q79 layoutManager = oe2Var.v1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i > oe2Var.J1 ? Math.min(i + 1, oe2Var.q1.d.size() - 1) : Math.max(i - 1, 0);
                    je2 je2Var = oe2Var.A1;
                    je2Var.a = min;
                    layoutManager.v0(je2Var);
                }
                oe2Var.J1 = i;
                break;
            case 3:
                int i2 = this.b;
                az7 az7Var = (az7) obj;
                if (((gf0) az7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) az7Var.b).get(i2);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) az7Var.c).get(i2);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    az7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) az7Var.e).playTogether(arrayList);
                    ((AnimatorSet) az7Var.e).addListener(new ad5(this, (byte) 25));
                    ((AnimatorSet) az7Var.e).start();
                    break;
                }
                break;
            case 4:
                cfa cfaVar = (cfa) obj;
                if (cfaVar.a && cfaVar.getParent() != null && this.b == cfaVar.c) {
                    cfaVar.a = false;
                    try {
                        cfaVar.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i3 = cfaVar.h;
                    if (i3 >= 0) {
                        cfaVar.y.c(((CharSequence) cfaVar.F.get(i3)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    cfaVar.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
            case 5:
                ((l6d) obj).b(this.b);
                break;
            default:
                ((olf) obj).H.b(this.b);
                break;
        }
    }

    public /* synthetic */ gf0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ gf0(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }
}
