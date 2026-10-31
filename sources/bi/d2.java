package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d2 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ d2(int i10) {
        this.a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                break;
            case 1:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                break;
            case 2:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(22.0f));
                break;
            case 4:
                float L = org.telegram.messenger.i0.L(12.0f);
                outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
                break;
            case 5:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(6.0f));
                break;
            case 6:
                outline.setRoundRect(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), view.getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), view.getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(6.0f));
                break;
            case 7:
                int i10 = org.telegram.messenger.i0.u;
                outline.setOval(0, 0, i10, i10);
                break;
            case 8:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.L(6.0f));
                break;
            case 9:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.N(6.0f));
                break;
            case 10:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + view.getMeasuredHeight(), org.telegram.messenger.i0.N(6.0f));
                break;
            case 11:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 12:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 13:
                outline.setOval(0, 0, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f));
                break;
            case 14:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(12.0f));
                break;
            case 15:
                outline.setRoundRect(0, org.telegram.messenger.i0.L(50.0f), view.getWidth(), org.telegram.messenger.i0.L(24.0f) + view.getHeight(), org.telegram.messenger.i0.L(24.0f));
                break;
            case 16:
                outline.setRoundRect(0, 0, org.telegram.messenger.i0.L(24.0f) + view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(24.0f));
                break;
            case 17:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(10.0f));
                break;
            case 18:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * org.telegram.messenger.i0.L(4.0f));
                break;
            case 19:
                outline.setOval(0, 0, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                break;
            case 20:
                outline.setOval(0, 0, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                break;
            case 21:
                ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
                if (imageReceiver != null) {
                    int[] E = imageReceiver.E();
                    int i11 = 0;
                    for (int i12 = 0; i12 < 4; i12++) {
                        i11 = Math.max(i11, E[i12]);
                    }
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i11);
                    break;
                } else {
                    int i13 = org.telegram.messenger.i0.u;
                    outline.setOval(0, 0, i13, i13);
                    break;
                }
            case 22:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 23:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                break;
            case 24:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.i0.L(10.0f));
                break;
            case 25:
                outline.setRoundRect(0, 0, view.getWidth(), org.telegram.messenger.i0.L(29.0f) + view.getHeight(), org.telegram.messenger.i0.L(29.0f));
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), org.telegram.messenger.i0.L(18.0f));
                break;
        }
    }
}
