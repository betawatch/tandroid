package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Components.l41 a;
    private int archivedRow;
    public kg.f0 b;
    public org.telegram.ui.Components.z21 c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.f5 h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final int s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final t41 y;

    public StickersActivity(int i3, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new t41(this, 0);
        this.s = i3;
        this.w = arrayList;
    }

    public static void Z(StickersActivity stickersActivity, org.telegram.ui.Components.r31 r31Var, View view) {
        int i3 = stickersActivity.s;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.x.isEmpty()) {
                stickersActivity.s0((org.telegram.ui.Cells.f8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.xv0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.pu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        int i10 = 5;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i3 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.xv0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.pu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (r31Var.d) {
            case 1:
            case 8:
                if (i3 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList p02 = stickersActivity.p0();
                    if (p02 != null) {
                        for (int i11 = 0; i11 < p02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p02.get(i11);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.li.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.pu(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    break;
                } else {
                    org.telegram.ui.Components.z21 z21Var = new org.telegram.ui.Components.z21(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.n31(stickersActivity.getParentActivity(), new x41(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.c = z21Var;
                    z21Var.show();
                    break;
                }
                break;
            case 2:
                stickersActivity.presentFragment(new o(i3));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new sx0());
                break;
            case 5:
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity, view);
                H.i(new pg(4, view), org.telegram.messenger.bd.M0(2131744411, null), org.telegram.messenger.az.E == 0);
                H.i(new pg(i10, view), org.telegram.messenger.bd.M0(2131744410, null), org.telegram.messenger.az.E == 1);
                H.i(new pg(6, view), org.telegram.messenger.bd.M0(2131744409, null), org.telegram.messenger.az.E == 2);
                H.Z();
                break;
            case 6:
                org.telegram.messenger.az.T0 = !org.telegram.messenger.az.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.az.T0);
                edit.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.T0);
                break;
            case 7:
                org.telegram.messenger.az.P();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.X);
                break;
            case 9:
                org.telegram.messenger.az.F = !org.telegram.messenger.az.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.az.F);
                edit2.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.F);
                break;
        }
    }

    public static void a0(StickersActivity stickersActivity, ArrayList arrayList) {
        t41 t41Var = stickersActivity.y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Object obj2 = ((org.telegram.ui.Components.r31) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.r = true;
        Collections.sort(org.telegram.messenger.li.b0(stickersActivity.currentAccount).s0(stickersActivity.s), new ls(stickersActivity, 3));
        org.telegram.messenger.g0.r(t41Var);
        org.telegram.messenger.g0.i3(t41Var, 1000L);
    }

    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        q3Var.f.a(true, true);
        if (q3Var.w) {
            org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static void e0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.f8 f8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r13;
        ArrayList arrayList = stickersActivity.f;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof org.telegram.ui.Cells.f8) || (stickersSet = (f8Var = (org.telegram.ui.Cells.f8) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i3 = 0;
        if (f8Var.E != view) {
            if (f8Var.F == view) {
                org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (f8Var.G == view) {
                    stickersActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) stickersActivity, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList arrayList2 = stickersActivity.getMediaDataController().t0[1];
        while (true) {
            if (i3 >= arrayList2.size()) {
                r13 = 0;
                break;
            } else {
                if (stickersSet.set.id == ((TLRPC.StickerSetCovered) arrayList2.get(i3)).set.id) {
                    r13 = (TLRPC.StickerSetCovered) arrayList2.get(i3);
                    break;
                }
                i3++;
            }
        }
        if (r13 != 0) {
            if (arrayList.contains(Long.valueOf(r13.set.id))) {
                return;
            } else {
                arrayList.add(Long.valueOf(r13.set.id));
            }
        }
        org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), r13 == 0 ? stickersSet : r13, 2, stickersActivity, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f0(StickersActivity stickersActivity, ArrayList arrayList, int i3) {
        int i10;
        int i11;
        long[] jArr;
        int i12;
        int i13;
        stickersActivity.o0();
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
        int i14 = stickersActivity.s;
        int i15 = 1;
        int i16 = i3 == 1 ? 0 : 1;
        long[] jArr2 = b02.Y;
        ArrayList[] arrayListArr = b02.H;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i17 = 0;
        while (i17 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i17);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i16 != 0) {
                stickerSet.archived = i16 == i15 ? i15 : 0;
            }
            int size2 = arrayListArr[i14].size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    i11 = i14;
                    jArr = jArr2;
                    i12 = i15;
                    i13 = i16;
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr[i14].get(i18);
                i12 = i15;
                i13 = i16;
                i11 = i14;
                jArr = jArr2;
                if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                    arrayListArr[i11].remove(i18);
                    b02.J.l(tL_messages_stickerSet.set.id);
                    b02.K.l(tL_messages_stickerSet.set.id);
                    b02.O.remove(tL_messages_stickerSet.set.short_name);
                    break;
                }
                i18++;
                i16 = i13;
                i14 = i11;
                i15 = i12;
                jArr2 = jArr;
            }
            i17++;
            i16 = i13;
            i14 = i11;
            i15 = i12;
            jArr2 = jArr;
        }
        int i19 = i14;
        boolean z10 = i15;
        int i20 = i16;
        long q10 = org.telegram.messenger.li.q(arrayListArr[i19]);
        jArr2[i19] = q10;
        b02.J1(i19, b02.Z[i19], q10, arrayListArr[i19]);
        org.telegram.messenger.hs notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i19);
        objArr[z10 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.hs.x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i20 != 0) {
            i10 = i20;
            if (i10 == z10) {
                tL_messages_toggleStickerSets.archive = z10;
            }
        } else {
            i10 = i20;
            tL_messages_toggleStickerSets.uninstall = z10;
        }
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.hf(b02, i10, stickersActivity, i19));
    }

    public static void g0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.v9) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            String Q = org.telegram.messenger.li.b0(stickersActivity.currentAccount).Q();
            if (Q != null) {
                if (Q.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.g5 m10 = org.telegram.ui.Components.g5.m(stickersActivity.currentAccount, Long.parseLong(Q.substring(9)), null, 2);
                        m10.a(v9Var.getValueBackupImageView());
                        v9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(stickersActivity.currentAccount).r.get(Q);
                if (tL_availableReaction != null) {
                    v9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.ac.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.t5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.k6.a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void h0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        final int i3;
        int i10;
        boolean z10;
        int i11;
        ArrayList arrayList2 = stickersActivity.f;
        int i12 = stickersActivity.s;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.l41 l41Var = stickersActivity.a;
        if (l41Var == null || (!l41Var.k3 && !stickersActivity.r && stickersActivity.n <= 0)) {
            if (i12 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.hp.s1(stickersActivity.currentAccount).w0(b02.s0(i12)));
                stickersActivity.w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.hp.s1(stickersActivity.currentAccount).w0(b02.s0(i12)));
            }
        }
        stickersActivity.e = new ArrayList(stickersActivity.p0());
        int i13 = 0;
        while (true) {
            i3 = 1;
            if (i13 >= stickersActivity.e.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.e.get(i13)).set.id))) {
                stickersActivity.e.remove(i13);
                i13--;
            }
            i13++;
        }
        int size = stickersActivity.e.size();
        int i14 = b02.c0[i12];
        int size2 = b02.s0(5).size();
        final int i15 = 2;
        if (i12 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.r31.d(1, R.drawable.msg2_trending, org.telegram.messenger.bd.M0(2131750834, null), size > 0 ? org.telegram.messenger.bd.E(size, ',') : ""));
            if (i14 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i12 == 0) {
                    arrayList.add(org.telegram.ui.Components.r31.d(2, R.drawable.msg2_archived_stickers, org.telegram.messenger.bd.M0(2131754128, null), org.telegram.messenger.bd.E(i14, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.r31.f(org.telegram.messenger.bd.M0(i12 == 5 ? 2131754134 : 2131754133, null), org.telegram.messenger.bd.E(i14, ','), 2));
                }
            }
            arrayList.size();
            String M0 = org.telegram.messenger.bd.M0(2131751197, null);
            String E = size2 > 0 ? org.telegram.messenger.bd.E(size2, ',') : "";
            org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(43);
            r31Var.d = 3;
            r31Var.k = R.drawable.msg2_smile_status;
            r31Var.l = M0;
            r31Var.m = E;
            arrayList.add(r31Var);
        } else if (i14 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i12 == 0) {
                arrayList.add(org.telegram.ui.Components.r31.d(2, R.drawable.msg2_archived_stickers, org.telegram.messenger.bd.M0(2131754128, null), org.telegram.messenger.bd.E(i14, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.r31.f(org.telegram.messenger.bd.M0(i12 == 5 ? 2131754134 : 2131754133, null), org.telegram.messenger.bd.E(i14, ','), 2));
            }
            if (i12 == 1) {
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131754129, null)));
            }
        }
        if (i12 == 0) {
            arrayList.size();
            String M02 = org.telegram.messenger.bd.M0(2131751351, null);
            org.telegram.ui.Components.r31 r31Var2 = new org.telegram.ui.Components.r31(43);
            r31Var2.d = 4;
            r31Var2.k = R.drawable.msg2_reactions2;
            r31Var2.l = M02;
            r31Var2.F = new s3(stickersActivity, 22);
            arrayList.add(r31Var2);
            arrayList.add(org.telegram.ui.Components.r31.C(stickersActivity.m0(org.telegram.messenger.bd.M0(i12 == 5 ? 2131751186 : 2131744876, null))));
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131744857, null)));
            stickersActivity.suggestRow = arrayList.size();
            String M03 = org.telegram.messenger.bd.M0(2131744412, null);
            int i16 = org.telegram.messenger.az.E;
            String M04 = i16 != 0 ? i16 != 1 ? org.telegram.messenger.bd.M0(2131744409, null) : org.telegram.messenger.bd.M0(2131744410, null) : org.telegram.messenger.bd.M0(2131744411, null);
            org.telegram.ui.Components.r31 r31Var3 = new org.telegram.ui.Components.r31(43);
            r31Var3.d = 5;
            r31Var3.l = M03;
            r31Var3.m = M04;
            arrayList.add(r31Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.r31 i17 = org.telegram.ui.Components.r31.i(6, org.telegram.messenger.bd.M0(2131749042, null));
            i17.L(org.telegram.messenger.az.T0);
            arrayList.add(i17);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.r31 i18 = org.telegram.ui.Components.r31.i(7, org.telegram.messenger.bd.M0(2131751340, null));
            i18.L(org.telegram.messenger.az.X);
            arrayList.add(i18);
            arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131751339, null)));
        }
        if (i12 == 5) {
            org.telegram.ui.Components.r31 i19 = org.telegram.ui.Components.r31.i(9, org.telegram.messenger.bd.M0(2131744426, null));
            i19.L(org.telegram.messenger.az.F);
            arrayList.add(i19);
            arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131744425, null)));
        }
        if (stickersActivity.d.size() > 0) {
            f41Var.V();
            if (i12 == 5 || (!stickersActivity.e.isEmpty() && i12 == 0)) {
                arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(i12 == 5 ? 2131752119 : 2131752118, null)));
            }
            f41Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj = arrayList4.get(i20);
                i20++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i21 = org.telegram.ui.Cells.e8.b;
                org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.e8.class);
                K.G = tL_messages_stickerSet;
                final int i22 = 0;
                K.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.s41
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i23 = i22;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i23) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity2, f8Var);
                                    final int i24 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131744868, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i25 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.bd.M0(2131744873, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.bd.M0(2131744861, null), new qv0(16, stickersActivity2, f8Var), false);
                                    final int i26 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.bd.M0(2131744856, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i27 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.bd.M0(2131744865, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.hs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K.E = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.s41
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i23 = i3;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i23) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity2, f8Var);
                                    final int i24 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131744868, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i25 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.bd.M0(2131744873, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.bd.M0(2131744861, null), new qv0(16, stickersActivity2, f8Var), false);
                                    final int i26 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.bd.M0(2131744856, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i27 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.bd.M0(2131744865, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.hs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K.L(stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            f41Var.L();
            f41Var.U();
            if (i12 != 1 && i12 != 5) {
                arrayList.add(org.telegram.ui.Components.r31.C(null));
            } else if (i12 == 1) {
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131748681, null)));
            }
        }
        if (stickersActivity.e.size() > 3) {
            i10 = 0;
            stickersActivity.e = new ArrayList(stickersActivity.e.subList(0, 3));
            z10 = true;
        } else {
            i10 = 0;
            z10 = false;
        }
        if (i12 != 5 || stickersActivity.e.isEmpty()) {
            i11 = 5;
        } else {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.r31.C(null));
            }
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(i12 == 5 ? 2131750836 : 2131750834, null)));
            ArrayList arrayList5 = stickersActivity.e;
            int size4 = arrayList5.size();
            while (i10 < size4) {
                Object obj2 = arrayList5.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i23 = org.telegram.ui.Cells.p3.b;
                org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(org.telegram.ui.Cells.p3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.s41
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i232 = i15;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i232) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.f8)) {
                                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
                                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(stickersActivity2, f8Var);
                                    final int i24 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.bd.M0(2131744868, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i25 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.bd.M0(2131744873, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.bd.M0(2131744861, null), new qv0(16, stickersActivity2, f8Var), false);
                                    final int i26 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.bd.M0(2131744856, null), new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i27 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.u41
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.q0(stickersSet)));
                                                        org.telegram.ui.Components.fc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.q0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        org.telegram.messenger.a8.g(e11, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.li.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.bd.M0(2131744865, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.hs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.e0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K2.t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i15 = 2;
            }
            if (z10) {
                org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(8, R.drawable.msg2_trending, org.telegram.messenger.bd.M0(2131745348, null));
                c2.q = true;
                arrayList.add(c2);
            }
            i11 = 5;
        }
        if (i12 == i11) {
            arrayList.add(org.telegram.ui.Components.r31.C(stickersActivity.m0(org.telegram.messenger.bd.M0(i12 == i11 ? 2131751186 : 2131744876, null))));
        }
    }

    public static void i0(StickersActivity stickersActivity, int i3) {
        StickersActivity stickersActivity2;
        String M0;
        TextView textView;
        int i10 = 0;
        int i11 = 2;
        if (i3 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i12);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.q0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.oo0 N0 = org.telegram.ui.Components.oo0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.l2 = new mr0(stickersActivity, i11);
            N0.show();
            return;
        }
        if (i3 == 0 || i3 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.x.size());
            int size2 = stickersActivity.d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i3 == 1) {
                        alertDialog$Builder.a.S = org.telegram.messenger.bd.a0(null, null, 2131751495, org.telegram.messenger.bd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.a0(null, null, 2131751494, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.bd.M0(2131751599, null);
                    } else {
                        alertDialog$Builder.a.S = org.telegram.messenger.bd.a0(null, null, 2131754142, org.telegram.messenger.bd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.a0(null, null, 2131754141, Integer.valueOf(size3));
                        M0 = org.telegram.messenger.bd.M0(2131754172, null);
                    }
                    alertDialog$Builder.k(M0, new k2.y(stickersActivity, arrayList, i3, 17));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    stickersActivity.showDialog(s1Var);
                    if (i3 != 1 || (textView = (TextView) s1Var.d(-1)) == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i10 >= size4) {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i10);
                    if (!stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                        i10++;
                    } else if (i3 == 0) {
                        stickersActivity2 = stickersActivity;
                        org.telegram.messenger.li.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity2, true, true);
                    } else {
                        stickersActivity2 = stickersActivity;
                        if (i3 == 1) {
                            org.telegram.messenger.li.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                        } else if (i3 == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity2.q0(tL_messages_stickerSet3));
                                stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131744856, null)), 500);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        } else if (i3 == 3) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.q0(tL_messages_stickerSet3)));
                                org.telegram.ui.Components.fc.j(stickersActivity2).j();
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        } else if (i3 == 4) {
                            HashSet hashSet = stickersActivity2.x;
                            if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                            } else {
                                hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                            }
                            stickersActivity2.a.g3.O(true);
                            stickersActivity2.n0();
                        }
                    }
                }
                stickersActivity2.o0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        int i3 = this.s;
        if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131744867, null));
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748687, null));
        } else if (i3 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751197, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 14));
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.c(2, R.drawable.msg_share, null, null, org.telegram.messenger.g0.L(54.0f), null);
        l10.c(0, R.drawable.msg_archive, null, null, org.telegram.messenger.g0.L(54.0f), null);
        this.h = l10.c(1, R.drawable.msg_delete, null, null, org.telegram.messenger.g0.L(54.0f), null);
        if (i3 != 5 || (arrayList = this.w) == null) {
            this.d = new ArrayList(org.telegram.messenger.hp.s1(this.currentAccount).w0(org.telegram.messenger.li.b0(this.currentAccount).s0(i3)));
        } else {
            this.d = arrayList;
        }
        this.e = p0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final int i10 = 0;
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new org.telegram.messenger.n10(this) { // from class: org.telegram.ui.v41
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        StickersActivity.h0(this.b, (ArrayList) obj, (org.telegram.ui.Components.f41) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, new w41(this), new w41(this));
        this.a = l41Var;
        l41Var.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final int i11 = 1;
        this.a.E1(new org.telegram.messenger.n10(this) { // from class: org.telegram.ui.v41
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.h0(this.b, (ArrayList) obj, (org.telegram.ui.Components.f41) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.a0(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        kg.f0 f0Var = new kg.f0(this, 9);
        this.b = f0Var;
        f0Var.j1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, b8.mf.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.x0;
        int i12 = this.s;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i3 == org.telegram.messenger.hs.z0 || i3 == org.telegram.messenger.hs.A0) {
            this.a.g3.O(true);
        } else if (i3 == org.telegram.messenger.hs.Z0 && ((Integer) objArr[0]).intValue() == i12) {
            this.a.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 16, new Class[]{org.telegram.ui.Cells.f8.class, org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.f8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.a, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.f8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        org.telegram.ui.Components.z21 z21Var = this.c;
        if (z21Var != null) {
            arrayList.addAll(z21Var.U());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final CharSequence m0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str;
    }

    public final void n0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean s6 = this.simpleActionBar.s();
        int i3 = 0;
        if (size <= 0) {
            if (s6) {
                this.simpleActionBar.r();
                this.a.z1(false);
                r0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i3 = 8;
                        break;
                    }
                }
            }
            if (this.h.getVisibility() != i3) {
                this.h.setVisibility(i3);
            }
        }
        this.simpleActionBar.x(size, s6);
        if (s6) {
            return;
        }
        this.simpleActionBar.B();
        this.a.z1(true);
        if (org.telegram.messenger.az.R || this.s == 5) {
            return;
        }
        org.telegram.messenger.az.R = true;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.az.R);
        edit.apply();
        org.telegram.ui.Components.ac.g(this, new org.telegram.ui.Components.zj0(getParentActivity(), org.telegram.messenger.bd.M0(2131744860, null)), 3250).j();
    }

    public final void o0() {
        this.x.clear();
        this.a.g3.O(true);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (this.x.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        o0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.currentAccount);
        int i3 = this.s;
        b02.B(i3);
        if (i3 == 0) {
            org.telegram.messenger.li.b0(this.currentAccount).x();
            org.telegram.messenger.li.b0(this.currentAccount).B(1);
            org.telegram.messenger.li.b0(this.currentAccount).B(5);
        } else if (i3 == 6) {
            org.telegram.messenger.li.b0(this.currentAccount).w();
            org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.A0);
        }
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.x0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.Z0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.z0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f5);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.A0);
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.x0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.Z0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.z0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.l41 l41Var = this.a;
        if (l41Var != null) {
            l41Var.g3.O(true);
        }
    }

    public final ArrayList p0() {
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.t0;
        if (this.s != 5) {
            return arrayListArr[0];
        }
        ArrayList arrayList = new ArrayList(arrayListArr[1]);
        int i3 = 0;
        while (i3 < arrayList.size()) {
            if (arrayList.get(i3) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i3)).set.id, false)) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        return arrayList;
    }

    public final String q0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.hp.s1(this.currentAccount).V2);
        sb2.append("/");
        return String.format(locale, a1.g.s(sb2, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void r0() {
        if (this.r) {
            this.r = false;
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.currentAccount);
            long[] jArr = b02.Y;
            ArrayList[] arrayListArr = b02.H;
            int i3 = this.s;
            jArr[i3] = org.telegram.messenger.li.q(arrayListArr[i3]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i3 == 1;
            tL_messages_reorderStickerSets.emojis = i3 == 5;
            int i10 = 0;
            while (i10 < this.d.size()) {
                i10 = a1.g.h(i10, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i10)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 22));
            org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.x0, Integer.valueOf(i3), Boolean.TRUE);
            if (org.telegram.messenger.az.X) {
                org.telegram.messenger.az.P();
                org.telegram.ui.Components.fc.a0(this).I(R.raw.filter_reorder, org.telegram.messenger.bd.M0(2131751338, null), org.telegram.messenger.bd.M0(2131751337, null)).j();
                this.a.g3.O(true);
            }
        }
    }

    public final void s0(org.telegram.ui.Cells.f8 f8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = f8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            f8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            f8Var.b(true, true);
        }
        this.a.g3.O(true);
        n0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
