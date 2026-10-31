package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d10 {
    public c10[] a;
    public c10 b;
    public c10 c;
    public c10 d;
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
        c10 c10Var = this.b;
        if (c10Var == null || c10Var.i != i10) {
            if (VoIPService.getSharedInstance() == null && this.b == null) {
                this.b = this.d;
                return;
            }
            c10 c10Var2 = z10 ? this.b : null;
            this.c = c10Var2;
            this.b = this.a[i10];
            if (c10Var2 != null) {
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
            org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
            if (u3Var == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.w3.w(14, sharedInstance.getChat())) && !sharedInstance.groupCall.b.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z10);
            }
        }
    }
}
