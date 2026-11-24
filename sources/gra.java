// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gra extends LinearLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gra(wsa wsaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = wsaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                if (wsaVar.W2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (wsaVar.W2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (wsaVar.W2.c(2)) {
                    break;
                }
                break;
            default:
                if (wsaVar.W2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
