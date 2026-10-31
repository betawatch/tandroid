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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public org.telegram.ui.Components.u51 a;
    private int archivedRow;
    public br b;
    public org.telegram.ui.Components.h41 c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.p5 h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final int s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final w61 y;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new w61(this, 0);
        this.s = i10;
        this.w = arrayList;
    }

    public static void Y(StickersActivity stickersActivity, org.telegram.ui.Components.a51 a51Var, View view) {
        int i10 = stickersActivity.s;
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.x.isEmpty()) {
                stickersActivity.r0((org.telegram.ui.Cells.k8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.cx0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        int i11 = 5;
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.cx0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (a51Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList o02 = stickersActivity.o0();
                    if (o02 != null) {
                        for (int i12 = 0; i12 < o02.size(); i12++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) o02.get(i12);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    org.telegram.messenger.ui.b0(stickersActivity.currentAccount).d1(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.cv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    break;
                } else {
                    org.telegram.ui.Components.h41 h41Var = new org.telegram.ui.Components.h41(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.w41(stickersActivity.getParentActivity(), new a71(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.c = h41Var;
                    h41Var.show();
                    break;
                }
                break;
            case 2:
                stickersActivity.presentFragment(new n(i10));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new pz0());
                break;
            case 5:
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity, view);
                H.i(new hh(4, view), org.telegram.messenger.cd.L0(2131744427, null), org.telegram.messenger.tz.E == 0);
                H.i(new hh(i11, view), org.telegram.messenger.cd.L0(2131744426, null), org.telegram.messenger.tz.E == 1);
                H.i(new hh(6, view), org.telegram.messenger.cd.L0(2131744425, null), org.telegram.messenger.tz.E == 2);
                H.Z();
                break;
            case 6:
                org.telegram.messenger.tz.T0 = !org.telegram.messenger.tz.T0;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                edit.putBoolean("allowBigEmoji", org.telegram.messenger.tz.T0);
                edit.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.T0);
                break;
            case 7:
                org.telegram.messenger.tz.P();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.X);
                break;
            case 9:
                org.telegram.messenger.tz.F = !org.telegram.messenger.tz.F;
                SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", org.telegram.messenger.tz.F);
                edit2.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.F);
                break;
        }
    }

    public static void Z(StickersActivity stickersActivity, ArrayList arrayList) {
        w61 w61Var = stickersActivity.y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.a51) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.r = true;
        Collections.sort(org.telegram.messenger.ui.b0(stickersActivity.currentAccount).s0(stickersActivity.s), new ot(stickersActivity, 3));
        org.telegram.messenger.i0.r(w61Var);
        org.telegram.messenger.i0.h3(w61Var, 1000L);
    }

    public static void c0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        s3Var.f.a(true, true);
        if (s3Var.w) {
            org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static void d0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.k8 k8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r13;
        ArrayList arrayList = stickersActivity.f;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof org.telegram.ui.Cells.k8) || (stickersSet = (k8Var = (org.telegram.ui.Cells.k8) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i10 = 0;
        if (k8Var.D != view) {
            if (k8Var.E == view) {
                org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (k8Var.F == view) {
                    stickersActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) stickersActivity, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList arrayList2 = stickersActivity.getMediaDataController().s0[1];
        while (true) {
            if (i10 >= arrayList2.size()) {
                r13 = 0;
                break;
            } else {
                if (stickersSet.set.id == ((TLRPC.StickerSetCovered) arrayList2.get(i10)).set.id) {
                    r13 = (TLRPC.StickerSetCovered) arrayList2.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (r13 != 0) {
            if (arrayList.contains(Long.valueOf(r13.set.id))) {
                return;
            } else {
                arrayList.add(Long.valueOf(r13.set.id));
            }
        }
        org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), r13 == 0 ? stickersSet : r13, 2, stickersActivity, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        int i11;
        int i12;
        long[] jArr;
        int i13;
        int i14;
        stickersActivity.n0();
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
        int i15 = stickersActivity.s;
        int i16 = 1;
        int i17 = i10 == 1 ? 0 : 1;
        long[] jArr2 = b02.X;
        ArrayList[] arrayListArr = b02.G;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i18 = 0;
        while (i18 < size) {
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i18);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i17 != 0) {
                stickerSet.archived = i17 == i16 ? i16 : 0;
            }
            int size2 = arrayListArr[i15].size();
            int i19 = 0;
            while (true) {
                if (i19 >= size2) {
                    i12 = i15;
                    jArr = jArr2;
                    i13 = i16;
                    i14 = i17;
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr[i15].get(i19);
                i13 = i16;
                i14 = i17;
                i12 = i15;
                jArr = jArr2;
                if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                    arrayListArr[i12].remove(i19);
                    b02.I.l(tL_messages_stickerSet.set.id);
                    b02.J.l(tL_messages_stickerSet.set.id);
                    b02.N.remove(tL_messages_stickerSet.set.short_name);
                    break;
                }
                i19++;
                i17 = i14;
                i15 = i12;
                i16 = i13;
                jArr2 = jArr;
            }
            i18++;
            i17 = i14;
            i15 = i12;
            i16 = i13;
            jArr2 = jArr;
        }
        int i20 = i15;
        boolean z10 = i16;
        int i21 = i17;
        long q6 = org.telegram.messenger.ui.q(arrayListArr[i20]);
        jArr2[i20] = q6;
        b02.J1(i20, b02.Y[i20], q6, arrayListArr[i20]);
        org.telegram.messenger.zs notificationCenter = b02.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i20);
        objArr[z10 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(org.telegram.messenger.zs.x0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i21 != 0) {
            i11 = i21;
            if (i11 == z10) {
                tL_messages_toggleStickerSets.archive = z10;
            }
        } else {
            i11 = i21;
            tL_messages_toggleStickerSets.uninstall = z10;
        }
        b02.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new org.telegram.messenger.of(b02, i11, stickersActivity, i20));
    }

    public static void f0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.x9) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            String Q = org.telegram.messenger.ui.b0(stickersActivity.currentAccount).Q();
            if (Q != null) {
                if (Q.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.f5 m10 = org.telegram.ui.Components.f5.m(stickersActivity.currentAccount, Long.parseLong(Q.substring(9)), null, 2);
                        m10.a(x9Var.getValueBackupImageView());
                        x9Var.getValueBackupImageView().setImageDrawable(m10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(stickersActivity.currentAccount).r.get(Q);
                if (tL_availableReaction != null) {
                    x9Var.getValueBackupImageView().getImageReceiver().q0(org.telegram.messenger.ic.b(tL_availableReaction.center_icon), "100_100_lastreactframe", org.telegram.messenger.v5.d(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.t6.a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void g0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.p51 p51Var) {
        final int i10;
        int i11;
        boolean z10;
        int i12;
        ArrayList arrayList2 = stickersActivity.f;
        int i13 = stickersActivity.s;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(stickersActivity.currentAccount);
        org.telegram.ui.Components.u51 u51Var = stickersActivity.a;
        if (u51Var == null || (!u51Var.j3 && !stickersActivity.r && stickersActivity.n <= 0)) {
            if (i13 == 5) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.vp.r1(stickersActivity.currentAccount).w0(b02.s0(i13)));
                stickersActivity.w = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(org.telegram.messenger.vp.r1(stickersActivity.currentAccount).w0(b02.s0(i13)));
            }
        }
        stickersActivity.e = new ArrayList(stickersActivity.o0());
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= stickersActivity.e.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.e.get(i14)).set.id))) {
                stickersActivity.e.remove(i14);
                i14--;
            }
            i14++;
        }
        int size = stickersActivity.e.size();
        int i15 = b02.b0[i13];
        int size2 = b02.s0(5).size();
        final int i16 = 2;
        if (i13 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.a51.d(1, R.drawable.msg2_trending, org.telegram.messenger.cd.L0(2131750834, null), size > 0 ? org.telegram.messenger.cd.E(size, ',') : ""));
            if (i15 > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i13 == 0) {
                    arrayList.add(org.telegram.ui.Components.a51.d(2, R.drawable.msg2_archived_stickers, org.telegram.messenger.cd.L0(2131754128, null), org.telegram.messenger.cd.E(i15, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.a51.f(org.telegram.messenger.cd.L0(i13 == 5 ? 2131754134 : 2131754133, null), org.telegram.messenger.cd.E(i15, ','), 2));
                }
            }
            arrayList.size();
            String L0 = org.telegram.messenger.cd.L0(2131751197, null);
            String E = size2 > 0 ? org.telegram.messenger.cd.E(size2, ',') : "";
            org.telegram.ui.Components.a51 a51Var = new org.telegram.ui.Components.a51(43);
            a51Var.d = 3;
            a51Var.k = R.drawable.msg2_smile_status;
            a51Var.l = L0;
            a51Var.m = E;
            arrayList.add(a51Var);
        } else if (i15 > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i13 == 0) {
                arrayList.add(org.telegram.ui.Components.a51.d(2, R.drawable.msg2_archived_stickers, org.telegram.messenger.cd.L0(2131754128, null), org.telegram.messenger.cd.E(i15, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.a51.f(org.telegram.messenger.cd.L0(i13 == 5 ? 2131754134 : 2131754133, null), org.telegram.messenger.cd.E(i15, ','), 2));
            }
            if (i13 == 1) {
                arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131754129, null)));
            }
        }
        if (i13 == 0) {
            arrayList.size();
            String L02 = org.telegram.messenger.cd.L0(2131751351, null);
            org.telegram.ui.Components.a51 a51Var2 = new org.telegram.ui.Components.a51(43);
            a51Var2.d = 4;
            a51Var2.k = R.drawable.msg2_reactions2;
            a51Var2.l = L02;
            a51Var2.F = new s3(stickersActivity, 22);
            arrayList.add(a51Var2);
            arrayList.add(org.telegram.ui.Components.a51.C(stickersActivity.l0(org.telegram.messenger.cd.L0(i13 == 5 ? 2131751186 : 2131744884, null))));
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131744865, null)));
            stickersActivity.suggestRow = arrayList.size();
            String L03 = org.telegram.messenger.cd.L0(2131744428, null);
            int i17 = org.telegram.messenger.tz.E;
            String L04 = i17 != 0 ? i17 != 1 ? org.telegram.messenger.cd.L0(2131744425, null) : org.telegram.messenger.cd.L0(2131744426, null) : org.telegram.messenger.cd.L0(2131744427, null);
            org.telegram.ui.Components.a51 a51Var3 = new org.telegram.ui.Components.a51(43);
            a51Var3.d = 5;
            a51Var3.l = L03;
            a51Var3.m = L04;
            arrayList.add(a51Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.a51 i18 = org.telegram.ui.Components.a51.i(6, org.telegram.messenger.cd.L0(2131749044, null));
            i18.L(org.telegram.messenger.tz.T0);
            arrayList.add(i18);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.a51 i19 = org.telegram.ui.Components.a51.i(7, org.telegram.messenger.cd.L0(2131751340, null));
            i19.L(org.telegram.messenger.tz.X);
            arrayList.add(i19);
            arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131751339, null)));
        }
        if (i13 == 5) {
            org.telegram.ui.Components.a51 i20 = org.telegram.ui.Components.a51.i(9, org.telegram.messenger.cd.L0(2131744442, null));
            i20.L(org.telegram.messenger.tz.F);
            arrayList.add(i20);
            arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131744441, null)));
        }
        if (stickersActivity.d.size() > 0) {
            p51Var.V();
            if (i13 == 5 || (!stickersActivity.e.isEmpty() && i13 == 0)) {
                arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(i13 == 5 ? 2131752119 : 2131752118, null)));
            }
            p51Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int size3 = arrayList4.size();
            int i21 = 0;
            while (i21 < size3) {
                Object obj = arrayList4.get(i21);
                i21++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i22 = org.telegram.ui.Cells.j8.b;
                org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.j8.class);
                K.G = tL_messages_stickerSet;
                final int i23 = 0;
                K.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.v61
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i24 = i23;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i24) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity2, k8Var);
                                    final int i25 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131744876, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i26 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.cd.L0(2131744881, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.cd.L0(2131744869, null), new t11(4, stickersActivity2, k8Var), false);
                                    final int i27 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.cd.L0(2131744864, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i28 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.cd.L0(2131744873, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.zs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.c0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K.E = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.v61
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i24 = i10;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i24) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity2, k8Var);
                                    final int i25 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131744876, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i26 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.cd.L0(2131744881, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.cd.L0(2131744869, null), new t11(4, stickersActivity2, k8Var), false);
                                    final int i27 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.cd.L0(2131744864, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i28 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.cd.L0(2131744873, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.zs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.c0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K.L(stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(K);
                arrayList4 = arrayList4;
            }
            p51Var.L();
            p51Var.U();
            if (i13 != 1 && i13 != 5) {
                arrayList.add(org.telegram.ui.Components.a51.C(null));
            } else if (i13 == 1) {
                arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131748688, null)));
            }
        }
        if (stickersActivity.e.size() > 3) {
            i11 = 0;
            stickersActivity.e = new ArrayList(stickersActivity.e.subList(0, 3));
            z10 = true;
        } else {
            i11 = 0;
            z10 = false;
        }
        if (i13 != 5 || stickersActivity.e.isEmpty()) {
            i12 = 5;
        } else {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.a51.C(null));
            }
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(i13 == 5 ? 2131750836 : 2131750834, null)));
            ArrayList arrayList5 = stickersActivity.e;
            int size4 = arrayList5.size();
            while (i11 < size4) {
                Object obj2 = arrayList5.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i24 = org.telegram.ui.Cells.r3.b;
                org.telegram.ui.Components.a51 K2 = org.telegram.ui.Components.a51.K(org.telegram.ui.Cells.r3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.v61
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i242 = i16;
                        final StickersActivity stickersActivity2 = this.b;
                        switch (i242) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(stickersActivity2, k8Var);
                                    final int i25 = 0;
                                    H.c(R.drawable.msg_archive, org.telegram.messenger.cd.L0(2131744876, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i26 = 1;
                                    H.l(R.drawable.msg_link, org.telegram.messenger.cd.L0(2131744881, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, org.telegram.messenger.cd.L0(2131744869, null), new t11(4, stickersActivity2, k8Var), false);
                                    final int i27 = 2;
                                    H.l(R.drawable.msg_share, org.telegram.messenger.cd.L0(2131744864, null), new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i27) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i28 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.x61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i28) {
                                                case 0:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.p0(stickersSet)));
                                                        org.telegram.ui.Components.cc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.p0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                                                        break;
                                                    } catch (Exception e7) {
                                                        org.telegram.messenger.f8.g(e7, true);
                                                        return;
                                                    }
                                                default:
                                                    org.telegram.messenger.ui.b0(r0.currentAccount).f2(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, org.telegram.messenger.cd.L0(2131744873, null), !stickersSet.set.official, true);
                                    H.S = org.telegram.messenger.zs.U2;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.d0(stickersActivity2, view);
                                break;
                            default:
                                StickersActivity.c0(stickersActivity2, view);
                                break;
                        }
                    }
                };
                K2.t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(K2);
                arrayList5 = arrayList5;
                i16 = 2;
            }
            if (z10) {
                org.telegram.ui.Components.a51 c10 = org.telegram.ui.Components.a51.c(8, R.drawable.msg2_trending, org.telegram.messenger.cd.L0(2131745356, null));
                c10.q = true;
                arrayList.add(c10);
            }
            i12 = 5;
        }
        if (i13 == i12) {
            arrayList.add(org.telegram.ui.Components.a51.C(stickersActivity.l0(org.telegram.messenger.cd.L0(i13 == i12 ? 2131751186 : 2131744884, null))));
        }
    }

    public static void h0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        String L0;
        TextView textView;
        int i11 = 0;
        int i12 = 1;
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.p0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.op0 N0 = org.telegram.ui.Components.op0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.k2 = new z01(stickersActivity, i12);
            N0.show();
            return;
        }
        if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.x.size());
            int size2 = stickersActivity.d.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i14);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.a.R = org.telegram.messenger.cd.a0(null, null, 2131751495, org.telegram.messenger.cd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.a0(null, null, 2131751494, Integer.valueOf(size3));
                        L0 = org.telegram.messenger.cd.L0(2131751599, null);
                    } else {
                        alertDialog$Builder.a.R = org.telegram.messenger.cd.a0(null, null, 2131754142, org.telegram.messenger.cd.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.a0(null, null, 2131754141, Integer.valueOf(size3));
                        L0 = org.telegram.messenger.cd.L0(2131754172, null);
                    }
                    alertDialog$Builder.k(L0, new ag.b0(stickersActivity, arrayList, i10, 16));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    stickersActivity.showDialog(x1Var);
                    if (i10 != 1 || (textView = (TextView) x1Var.d(-1)) == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i11 >= size4) {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i11);
                    if (!stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                        i11++;
                    } else if (i10 == 0) {
                        stickersActivity2 = stickersActivity;
                        org.telegram.messenger.ui.b0(stickersActivity.currentAccount).f2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity2, true, true);
                    } else {
                        stickersActivity2 = stickersActivity;
                        if (i10 == 1) {
                            org.telegram.messenger.ui.b0(stickersActivity2.currentAccount).f2(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                        } else if (i10 == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity2.p0(tL_messages_stickerSet3));
                                stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131744864, null)), 500);
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                        } else if (i10 == 3) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.p0(tL_messages_stickerSet3)));
                                org.telegram.ui.Components.cc.j(stickersActivity2).j();
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                        } else if (i10 == 4) {
                            HashSet hashSet = stickersActivity2.x;
                            if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                            } else {
                                hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                            }
                            stickersActivity2.a.f3.O(true);
                            stickersActivity2.m0();
                        }
                    }
                }
                stickersActivity2.n0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        int i10 = this.s;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131744875, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748694, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751197, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 4));
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.c(2, R.drawable.msg_share, null, null, org.telegram.messenger.i0.L(54.0f), null);
        l4.c(0, R.drawable.msg_archive, null, null, org.telegram.messenger.i0.L(54.0f), null);
        this.h = l4.c(1, R.drawable.msg_delete, null, null, org.telegram.messenger.i0.L(54.0f), null);
        if (i10 != 5 || (arrayList = this.w) == null) {
            this.d = new ArrayList(org.telegram.messenger.vp.r1(this.currentAccount).w0(org.telegram.messenger.ui.b0(this.currentAccount).s0(i10)));
        } else {
            this.d = arrayList;
        }
        this.e = o0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final int i11 = 0;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new org.telegram.messenger.j20(this) { // from class: org.telegram.ui.y61
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.g0(this.b, (ArrayList) obj, (org.telegram.ui.Components.p51) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.Z(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, new z61(this), new z61(this));
        this.a = u51Var;
        u51Var.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final int i12 = 1;
        this.a.E1(new org.telegram.messenger.j20(this) { // from class: org.telegram.ui.y61
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        StickersActivity.g0(this.b, (ArrayList) obj, (org.telegram.ui.Components.p51) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.Z(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        br brVar = new br(8, this, null == true ? 1 : 0);
        this.b = brVar;
        brVar.j1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.x0;
        int i13 = this.s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == i13) {
                this.f.clear();
            }
            this.a.f3.O(true);
        } else if (i10 == org.telegram.messenger.zs.z0 || i10 == org.telegram.messenger.zs.A0) {
            this.a.f3.O(true);
        } else if (i10 == org.telegram.messenger.zs.Z0 && ((Integer) objArr[0]).intValue() == i13) {
            this.a.f3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.t8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k7));
        org.telegram.ui.Components.h41 h41Var = this.c;
        if (h41Var != null) {
            arrayList.addAll(h41Var.V());
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final CharSequence l0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.f4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return str;
    }

    public final void m0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean s10 = this.simpleActionBar.s();
        int i10 = 0;
        if (size <= 0) {
            if (s10) {
                this.simpleActionBar.r();
                this.a.z1(false);
                q0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i10 = 8;
                        break;
                    }
                }
            }
            if (this.h.getVisibility() != i10) {
                this.h.setVisibility(i10);
            }
        }
        this.simpleActionBar.y(size, s10);
        if (s10) {
            return;
        }
        this.simpleActionBar.C();
        this.a.z1(true);
        if (org.telegram.messenger.tz.R || this.s == 5) {
            return;
        }
        org.telegram.messenger.tz.R = true;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putBoolean("stickersReorderingHintUsed", org.telegram.messenger.tz.R);
        edit.apply();
        org.telegram.ui.Components.wb.g(this, new org.telegram.ui.Components.zk0(getParentActivity(), org.telegram.messenger.cd.L0(2131744868, null)), 3250).j();
    }

    public final void n0() {
        this.x.clear();
        this.a.f3.O(true);
        m0();
    }

    public final ArrayList o0() {
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
        ArrayList[] arrayListArr = b02.s0;
        if (this.s != 5) {
            return arrayListArr[0];
        }
        ArrayList arrayList = new ArrayList(arrayListArr[1]);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == null || b02.B0(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.id, false)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.x.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        n0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
        int i10 = this.s;
        b02.B(i10);
        if (i10 == 0) {
            org.telegram.messenger.ui.b0(this.currentAccount).x();
            org.telegram.messenger.ui.b0(this.currentAccount).B(1);
            org.telegram.messenger.ui.b0(this.currentAccount).B(5);
        } else if (i10 == 6) {
            org.telegram.messenger.ui.b0(this.currentAccount).w();
            org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.A0);
        }
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.x0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.Z0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.z0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f5);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.A0);
        }
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.x0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.Z0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.z0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f5);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u51 u51Var = this.a;
        if (u51Var != null) {
            u51Var.f3.O(true);
        }
    }

    public final String p0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.vp.r1(this.currentAccount).U2);
        sb2.append("/");
        return String.format(locale, a1.g.r(sb2, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void q0() {
        if (this.r) {
            this.r = false;
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.currentAccount);
            long[] jArr = b02.X;
            ArrayList[] arrayListArr = b02.G;
            int i10 = this.s;
            jArr[i10] = org.telegram.messenger.ui.q(arrayListArr[i10]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i10 == 1;
            tL_messages_reorderStickerSets.emojis = i10 == 5;
            int i11 = 0;
            while (i11 < this.d.size()) {
                i11 = c3.i0.k(i11, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i11)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new k(this, 22));
            org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.x0, Integer.valueOf(i10), Boolean.TRUE);
            if (org.telegram.messenger.tz.X) {
                org.telegram.messenger.tz.P();
                org.telegram.ui.Components.cc.a0(this).I(R.raw.filter_reorder, org.telegram.messenger.cd.L0(2131751338, null), org.telegram.messenger.cd.L0(2131751337, null)).j();
                this.a.f3.O(true);
            }
        }
    }

    public final void r0(org.telegram.ui.Cells.k8 k8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            k8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            k8Var.b(true, true);
        }
        this.a.f3.O(true);
        m0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
