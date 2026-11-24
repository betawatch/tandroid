// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mpc extends sm3 {
    public final /* synthetic */ npc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpc(npc npcVar, Context context) {
        super(context);
        this.M = npcVar;
    }

    @Override // sm3, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.M.y && super.onTouchEvent(motionEvent);
    }
}
