// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class c81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c81(View view, AtomicBoolean atomicBoolean, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = view;
        this.b = atomicBoolean;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        AtomicBoolean atomicBoolean = this.b;
        View view = this.c;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) view;
                l46 l46Var = (l46) obj2;
                String str = (String) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
                frameLayout.setScaleX(abs);
                frameLayout.setScaleY(abs);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    l46Var.setText(str);
                    break;
                }
                break;
            default:
                ImageView imageView = (ImageView) view;
                boolean[] zArr = (boolean[]) obj2;
                wjb wjbVar = (wjb) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs2 = ((Math.abs(floatValue2 - 0.5f) / 0.5f) * 0.25f) + 0.75f;
                imageView.setScaleX(abs2);
                imageView.setScaleY(abs2);
                if (floatValue2 >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    zkb.s(imageView, zArr[0] ? bkb.Ei : bkb.y6, wjbVar, PorterDuff.Mode.SRC_IN);
                    imageView.setImageResource(zArr[0] ? R.drawable.wallet_comment_locked : R.drawable.wallet_comment_unlocked);
                    break;
                }
                break;
        }
    }
}
