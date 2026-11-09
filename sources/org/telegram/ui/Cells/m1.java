package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m1 {
    public final boolean a;
    public final ImageReceiver b;
    public final org.telegram.ui.Components.w8 c;
    public final RectF d;
    public final ic e;
    public StaticLayout f;
    public StaticLayout g;
    public StaticLayout h;
    public boolean i;
    public int j;
    public y k;
    public int l;
    public b80 m;
    public boolean n;
    public final float[] o;

    public m1(q1 q1Var, boolean z9) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.b = imageReceiver;
        this.c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.d = new RectF();
        this.e = new ic(q1Var);
        this.o = new float[8];
        this.a = z9;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (q1Var.N0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i7) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i7 - org.telegram.messenger.g0.L(22.0f);
        this.j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout U2 = q1.U2(str, q1.jd, L);
        this.f = U2;
        if (U2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + q1.K1(U2);
            L -= L2;
            this.j = org.telegram.messenger.k5.C(6.0f, L2, this.j);
        }
        int i10 = 0;
        boolean z9 = tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null : (userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null);
        this.i = z9;
        ImageReceiver imageReceiver = this.b;
        if (z9) {
            org.telegram.ui.Components.w8 w8Var = this.c;
            w8Var.p(tLObject);
            imageReceiver.i0(tLObject, w8Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            this.j = org.telegram.messenger.k5.C(21.0f, this.f == null ? org.telegram.messenger.g0.L(6.0f) : 0, this.j);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder L3 = q1.L3(charSequence2);
        int i11 = i7 / 2;
        StaticLayout U22 = q1.U2(charSequence, textPaint, L - (L3 != null ? org.telegram.messenger.g0.L(4.0f) + (L3 == null ? 0 : Math.min(i11, (int) Math.ceil(q1.kd.measureText(L3, 0, L3.length())))) : 0));
        this.g = U22;
        if (U22 != null) {
            int L4 = org.telegram.messenger.g0.L(4.0f) + q1.K1(U22);
            L -= L4;
            this.j = ((this.f != null || this.i) ? 0 : org.telegram.messenger.g0.L(6.0f)) + L4 + this.j;
        }
        StaticLayout U23 = L > org.telegram.messenger.g0.L(24.0f) ? q1.U2(L3, q1.kd, Math.min(i11, L)) : null;
        this.h = U23;
        if (U23 == null) {
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
        this.j = q1.K1(this.h) + i10 + i12;
    }
}
