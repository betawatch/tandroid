package org.telegram.ui;

import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ex0(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 1:
                int i12 = obj instanceof gy0 ? ((gy0) obj).g : obj instanceof org.telegram.messenger.hp ? ((org.telegram.messenger.hp) obj).d : 0;
                int i13 = obj2 instanceof gy0 ? ((gy0) obj2).g : obj2 instanceof org.telegram.messenger.hp ? ((org.telegram.messenger.hp) obj2).d : 0;
                if (i12 < i13) {
                    return -1;
                }
                return i12 > i13 ? 1 : 0;
            case 2:
                long j10 = org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y;
                long j11 = org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 3:
                return Integer.compare(((org.telegram.ui.ActionBar.s6) obj).V, ((org.telegram.ui.ActionBar.s6) obj2).V);
            case 4:
                long j12 = org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y;
                long j13 = org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 5:
                return Integer.compare(((org.telegram.ui.Wallet.g0) obj2).b, ((org.telegram.ui.Wallet.g0) obj).b);
            case 6:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 7:
                long j14 = org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y;
                long j15 = org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 8:
                return (int) (((org.telegram.ui.web.i) obj2).c - ((org.telegram.ui.web.i) obj).c);
            case 9:
                return (int) (((org.telegram.ui.web.i) obj2).c - ((org.telegram.ui.web.i) obj).c);
            case 10:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).z, ((org.telegram.utils.twidget.m) obj).z);
            case 11:
                return ((p2.e) obj).a.compareTo(((p2.e) obj2).a);
            case 12:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 13:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 14:
                return (int) (((rh.t8) obj2).d - ((rh.t8) obj).d);
            case 15:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 16:
                return (int) (sg.p0.j((TLObject) obj) - sg.p0.j((TLObject) obj2));
            case 17:
                long j16 = ((sh.a) obj2).c;
                long j17 = ((sh.a) obj).c;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 18:
                i10 = ((th.l) obj2).b;
                i11 = ((th.l) obj).b;
                break;
            case 19:
            case 21:
                i10 = ((th.i0) obj2).c;
                i11 = ((th.i0) obj).c;
                break;
            case 20:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 22:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 23:
                int i14 = ProfileStoriesView.s0;
                return (int) (((th.c3) obj2).i - ((th.c3) obj).i);
            case 24:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 25:
                sg.o0 o0Var = (sg.o0) obj2;
                String str = ((sg.o0) obj).f;
                int i15 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = o0Var.f;
                return i15 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 26:
                return (int) (((vh.u8) obj2).e - ((vh.u8) obj).e);
            case 27:
                i10 = ((b2.x) obj2).j;
                i11 = ((b2.x) obj).j;
                break;
            case 28:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            default:
                return Integer.compare(((x2.g) ((List) obj).get(0)).f, ((x2.g) ((List) obj2).get(0)).f);
        }
        return i10 - i11;
    }
}
