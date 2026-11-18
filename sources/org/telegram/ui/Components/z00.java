package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z00 {
    public y00[] a;
    public y00 b;
    public y00 c;
    public y00 d;
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

    public final void b(int i7, boolean z10) {
        y00 y00Var = this.b;
        if (y00Var == null || y00Var.i != i7) {
            if (VoIPService.getSharedInstance() == null && this.b == null) {
                this.b = this.d;
                return;
            }
            y00 y00Var2 = z10 ? this.b : null;
            this.c = y00Var2;
            this.b = this.a[i7];
            if (y00Var2 != null) {
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
            org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
            if (t3Var == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) && !sharedInstance.groupCall.b.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z10);
            }
        }
    }
}
