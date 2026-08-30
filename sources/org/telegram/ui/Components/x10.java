package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x10 {
    public w10[] a;
    public w10 b;
    public w10 c;
    public w10 d;
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

    public final void a(float f10) {
        this.g = f10;
        float f11 = this.e;
        this.h = (f10 - f11) / 250.0f;
        this.i = (f10 - f11) / 120.0f;
    }

    public final void b(int i10, boolean z4) {
        w10 w10Var = this.b;
        if (w10Var == null || w10Var.i != i10) {
            if (VoIPService.getSharedInstance() == null && this.b == null) {
                this.b = this.d;
                return;
            }
            w10 w10Var2 = z4 ? this.b : null;
            this.c = w10Var2;
            this.b = this.a[i10];
            if (w10Var2 != null) {
                this.k = 0.0f;
            } else {
                this.k = 1.0f;
            }
        }
    }

    public final void c(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z4);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z4);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z4);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z4);
            }
        }
    }
}
