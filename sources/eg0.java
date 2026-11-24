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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eg0 implements Runnable {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ Object c;

    public eg0(ChatActivityEnterView chatActivityEnterView) {
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
                hg0 hg0Var = (hg0) obj;
                if (hg0Var.a && hg0Var.getParent() != null && this.b == hg0Var.c) {
                    hg0Var.a = false;
                    if (hg0Var.q()) {
                        try {
                            hg0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        hg0Var.onTouchEvent(obtain);
                        obtain.recycle();
                        break;
                    }
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null && (currentPage = jz1Var.getCurrentPage()) != this.b) {
                    this.b = currentPage;
                    boolean z = chatActivityEnterView.n4;
                    boolean z2 = currentPage == 1 || currentPage == 2;
                    chatActivityEnterView.n4 = z2;
                    boolean z3 = chatActivityEnterView.o4;
                    chatActivityEnterView.o4 = currentPage == 0;
                    if (chatActivityEnterView.p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.R1(currentPage != 0 ? 1 : 2, true);
                            chatActivityEnterView.N();
                        } else if (!z2) {
                            chatActivityEnterView.S1(false, true, false, true);
                        }
                    }
                    if (z != chatActivityEnterView.n4 || z3 != chatActivityEnterView.o4) {
                        chatActivityEnterView.M(true);
                        break;
                    }
                }
                break;
            case 2:
                int i = this.b;
                if2 if2Var = (if2) obj;
                f69 layoutManager = if2Var.v1.getLayoutManager();
                if (layoutManager != null) {
                    int min = i > if2Var.J1 ? Math.min(i + 1, if2Var.q1.d.size() - 1) : Math.max(i - 1, 0);
                    df2 df2Var = if2Var.A1;
                    df2Var.a = min;
                    layoutManager.v0(df2Var);
                }
                if2Var.J1 = i;
                break;
            case 3:
                int i2 = this.b;
                wx7 wx7Var = (wx7) obj;
                if (((eg0) wx7Var.f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) wx7Var.b).get(i2);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) wx7Var.c).get(i2);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    wx7Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) wx7Var.e).playTogether(arrayList);
                    ((AnimatorSet) wx7Var.e).addListener(new v85(this, (byte) 28));
                    ((AnimatorSet) wx7Var.e).start();
                    break;
                }
                break;
            case 4:
                lda ldaVar = (lda) obj;
                if (ldaVar.a && ldaVar.getParent() != null && this.b == ldaVar.c) {
                    ldaVar.a = false;
                    try {
                        ldaVar.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    int i3 = ldaVar.h;
                    if (i3 >= 0) {
                        ldaVar.y.c(((CharSequence) ldaVar.F.get(i3)).toString(), true);
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    ldaVar.onTouchEvent(obtain2);
                    obtain2.recycle();
                    break;
                }
                break;
            case 5:
                ((w3d) obj).b(this.b);
                break;
            default:
                ((zif) obj).H.b(this.b);
                break;
        }
    }

    public /* synthetic */ eg0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ eg0(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.c = viewGroup;
    }
}
