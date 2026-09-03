package ng;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e extends ImageView {
    public long a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Context context) {
        super(context);
        this.b = fVar;
        this.a = 0L;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            fVar.b = true;
            fVar.c = false;
            AndroidUtilities.runOnUIThread(new af.b(fVar, 350, 10), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.b = false;
            if (!fVar.c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
