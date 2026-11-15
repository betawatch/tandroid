package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m1 {
    public final boolean a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.t8 c;
    public final RectF d;
    public final dc e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public y k;
    public int l;
    public d80 m;
    public boolean n;
    public final float[] o;

    public m1(q1 q1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.b = imageReceiver;
        this.c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.d = new RectF();
        this.e = new dc(q1Var);
        this.o = new float[8];
        this.a = z10;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (q1Var.O0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i7) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i7 - org.telegram.messenger.g0.L(22.0f);
        this.j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout V2 = q1.V2(str, q1.xd, L);
        this.f = V2;
        if (V2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + q1.L1(V2);
            L -= L2;
            this.j = org.telegram.messenger.k5.C(6.0f, L2, this.j);
        }
        int i10 = 0;
        boolean z10 = tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null : (userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null);
        this.i = z10;
        ImageReceiver imageReceiver = this.b;
        if (z10) {
            org.telegram.ui.Components.t8 t8Var = this.c;
            t8Var.p(tLObject);
            imageReceiver.i0(tLObject, t8Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            this.j = org.telegram.messenger.k5.C(21.0f, this.f == null ? org.telegram.messenger.g0.L(6.0f) : 0, this.j);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder M3 = q1.M3(charSequence2);
        int i11 = i7 / 2;
        StaticLayout V22 = q1.V2(charSequence, textPaint, L - (M3 != null ? org.telegram.messenger.g0.L(4.0f) + (M3 == null ? 0 : Math.min(i11, (int) Math.ceil(q1.yd.measureText(M3, 0, M3.length())))) : 0));
        this.g = V22;
        if (V22 != null) {
            int L3 = org.telegram.messenger.g0.L(4.0f) + q1.L1(V22);
            L -= L3;
            this.j = ((this.f != null || this.i) ? 0 : org.telegram.messenger.g0.L(6.0f)) + L3 + this.j;
        }
        StaticLayout V23 = L > org.telegram.messenger.g0.L(24.0f) ? q1.V2(M3, q1.yd, Math.min(i11, L)) : null;
        this.h = V23;
        if (V23 == null) {
            if (this.g == null && this.f == null) {
                return;
            }
            this.j -= org.telegram.messenger.g0.L(4.0f);
            return;
        }
        int i12 = this.j;
        if (this.f == null && !this.i && this.g == null) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        }
        this.j = q1.L1(this.h) + i10 + i12;
    }
}
