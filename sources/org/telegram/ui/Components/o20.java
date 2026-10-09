package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o20 {
    public n20[] a;
    public n20 b;
    public n20 c;
    public n20 d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;
    public float k;
    public ArrayList l;
    public Paint m;
    public Path n;

    public final void a(float f7) {
        this.g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        n20 n20Var = this.b;
        if (n20Var == null || n20Var.i != i10) {
            if (VoIPService.getSharedInstance() == null && this.b == null) {
                this.b = this.d;
                return;
            }
            n20 n20Var2 = z10 ? this.b : null;
            this.c = n20Var2;
            this.b = this.a[i10];
            if (n20Var2 != null) {
                this.k = 0.0f;
            } else {
                this.k = 1.0f;
            }
        }
    }

    public final void c(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z10);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z10);
            }
        }
    }
}
