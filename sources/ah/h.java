package ah;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class h extends ImageView {
    public long a;
    public final /* synthetic */ i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context) {
        super(context);
        this.b = iVar;
        this.a = 0L;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        i iVar = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            iVar.b = true;
            iVar.c = false;
            AndroidUtilities.runOnUIThread(new g(iVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            iVar.b = false;
            if (!iVar.c && (callback = iVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    iVar.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
