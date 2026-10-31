package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ns extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40 {
    public org.telegram.ui.Cells.p8 D;
    public ls E;
    public org.telegram.ui.Cells.p8 F;
    public org.telegram.messenger.dp G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ms O;
    public final org.telegram.ui.Components.b40 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.g9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.u51 W;
    public boolean X;
    public boolean Y;
    public org.telegram.messenger.jj Z;
    public org.telegram.ui.ActionBar.l5 a;
    public org.telegram.ui.Cells.m3 b;
    public org.telegram.ui.Cells.m3 c;
    public org.telegram.ui.Cells.m3 d;
    public org.telegram.ui.Components.g9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.r8 n;
    public final org.telegram.ui.ActionBar.p6 r;
    public RadialProgressView s;
    public kg.f0 w;
    public AnimatorSet x;
    public org.telegram.ui.Cells.p8 y;

    public ns(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.b40(0, true, true);
    }

    public static /* synthetic */ void Y(ns nsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = nsVar.getMessagesController().n1(nsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(nsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new k(nsVar, 5));
    }

    public static void Z(ns nsVar, TLRPC.User user) {
        nsVar.Q = null;
        nsVar.g0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
        Z1.photo.personal = false;
        TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(nsVar.currentAccount).a2(nsVar.H);
        if (a2 != null) {
            a2.personal_photo = null;
            a2.flags &= -2097153;
            nsVar.getMessagesStorage().j2(a2, true);
        }
        TLRPC.Photo photo = nsVar.T;
        if (photo != null) {
            Z1.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 1000, false, null, false);
            if (w9 != null) {
                Z1.photo.photo_small = w9.location;
            }
            if (w10 != null) {
                Z1.photo.photo_big = w10.location;
            }
        } else {
            Z1.photo = null;
            Z1.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        nsVar.getMessagesStorage().m1(arrayList2, null, false, true);
        nsVar.j0();
        nsVar.getNotificationCenter().k(org.telegram.messenger.zs.c0, new Object[0]);
        nsVar.getNotificationCenter().k(org.telegram.messenger.zs.r, 2);
    }

    public static void a0(ns nsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.b40 b40Var = nsVar.P;
        if (b40Var.T) {
            return;
        }
        int i10 = nsVar.S;
        if (i10 == 2) {
            nsVar.Q = photoSize.location;
        } else if (i10 == 1 && nsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.z4 parentLayout = nsVar.getParentLayout();
            org.telegram.ui.ActionBar.k2 lastFragment = nsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(size);
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    org.telegram.ui.ActionBar.k2 k2Var2 = lastFragment;
                    if (unVar.a() == nsVar.H && unVar.f4 == 0) {
                        unVar.mb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                            if (arrayList.get(size2) != k2Var3) {
                                ((org.telegram.ui.ActionBar.k2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            k2Var2 = k2Var3;
                        }
                        k2Var2.finishFragment();
                    } else {
                        lastFragment = k2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.k2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            nsVar.e.j(org.telegram.messenger.ic.e(nsVar.Q), "50_50", nsVar.n, nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H)));
            if (nsVar.S == 2) {
                nsVar.h0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.qz.C(nsVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.qz.E();
                tL_messageService.dialog_id = nsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j10 = nsVar.getUserConfig().j();
                tL_messageService.id = j10;
                tL_messageService.local_id = j10;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = nsVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = nsVar.H;
                tL_messageService.date = nsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(nsVar.currentAccount, tL_messageService, false, false);
                nsVar.Z = jjVar;
                arrayList2.add(jjVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.vp.r1(nsVar.currentAccount).i5(0, nsVar.H, arrayList2);
                nsVar.getMessagesController().C7.put(tL_messageService.local_id, b40Var);
            }
        } else {
            TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
            if (nsVar.Z == null && Z1 != null) {
                boolean z11 = inputFile2 != null;
                Z1.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                Z1.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Z1);
                nsVar.getMessagesStorage().m1(arrayList3, null, false, true);
                nsVar.getNotificationCenter().k(org.telegram.messenger.zs.c0, new Object[0]);
                org.telegram.messenger.zs notificationCenter = nsVar.getNotificationCenter();
                int i11 = org.telegram.messenger.vp.D8;
                notificationCenter.k(org.telegram.messenger.zs.r, 2);
            }
            nsVar.g0(nsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, nsVar.S);
            nsVar.h0(false, true);
        }
        nsVar.j0();
    }

    public static void b0(ns nsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (nsVar.Z != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
        TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(nsVar.currentAccount).a2(nsVar.H);
        if (a2 != null) {
            a2.personal_photo = tL_photos_photo.photo;
            a2.flags |= TLObject.FLAG_21;
            nsVar.getMessagesStorage().j2(a2, true);
        }
        if (Z1 != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 1000, false, null, false);
            if (w9 != null && fileLocation != null) {
                org.telegram.messenger.b8.G(nsVar.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(nsVar.currentAccount);
                org.telegram.messenger.b8.K(fileLocation, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, fileLocation.local_id, "@50_50");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.ic.l(nsVar.currentAccount, 1, Z1));
            }
            if (w10 != null && fileLocation2 != null) {
                org.telegram.messenger.b8.G(nsVar.currentAccount);
                File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                org.telegram.messenger.b8.G(nsVar.currentAccount);
                org.telegram.messenger.b8.K(fileLocation2, null, true, true).renameTo(K2);
            }
            rf.z.a(tL_photos_photo.photo, Z1, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Z1);
            nsVar.getMessagesStorage().m1(arrayList2, null, false, true);
            nsVar.getMessagesController().T0(nsVar.H);
            nsVar.getNotificationCenter().k(org.telegram.messenger.zs.c0, new Object[0]);
            nsVar.getNotificationCenter().k(org.telegram.messenger.zs.r, 2);
            if (nsVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.cc.a0(nsVar).V(arrayList2, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("UserCustomPhotoSeted", null, 2131743769, Z1.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.cc.a0(nsVar).V(arrayList2, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("UserCustomPhotoSeted", null, 2131743769, Z1.first_name)), null, null).j();
                }
            }
        }
        nsVar.Q = null;
        nsVar.j0();
    }

    public static /* synthetic */ void c0(ns nsVar) {
        if (nsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(nsVar.Z.f1()));
            org.telegram.messenger.zs.f(nsVar.currentAccount).k(org.telegram.messenger.zs.w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final void H(float f7) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.a40
    public final void T() {
        org.telegram.messenger.i0.g3(new ds(this, 0));
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.es
            @Override // java.lang.Runnable
            public final void run() {
                ns.a0(ns.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        final int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.I) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751283, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new js(this));
        this.a = this.simpleActionBar.n(org.telegram.messenger.cd.L0(this.I ? 2131751753 : 2131745963, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        org.telegram.ui.ActionBar.a7.i(i11, frameLayout2, p6Var);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(32.0f));
        this.V.addView(this.e, w7.b6.d(64, 64.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kg.f0 f0Var = new kg.f0(this, context, paint, 9);
        this.w = f0Var;
        this.V.addView(f0Var, w7.b6.d(64, 64.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(30.0f));
        this.s.setProgressColor(-1);
        final int i12 = 0;
        this.s.setNoProgress(false);
        this.V.addView(this.s, w7.b6.d(64, 64.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        h0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        this.f.setTypeface(org.telegram.messenger.i0.o());
        FrameLayout frameLayout3 = this.V;
        TextView textView3 = this.f;
        boolean z10 = org.telegram.messenger.cd.X;
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout3, textView3, w7.b6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = l4;
        org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.A6, p6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        FrameLayout frameLayout4 = this.V;
        TextView textView4 = this.h;
        boolean z11 = org.telegram.messenger.cd.X;
        frameLayout4.addView(textView4, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131750695, null), false, false, -1, this.r);
        this.b = m3Var;
        m3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.a7.i(i11, this.b, p6Var);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hs
            public final /* synthetic */ ns b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i13 != 5) {
                            return false;
                        }
                        ns nsVar = this.b;
                        nsVar.c.d.requestFocus();
                        org.telegram.ui.Cells.k3 k3Var = nsVar.c.d;
                        k3Var.setSelection(k3Var.length());
                        return true;
                    case 1:
                        ns nsVar2 = this.b;
                        if (i13 == 6) {
                            nsVar2.a.performClick();
                            return true;
                        }
                        if (i13 != 5) {
                            return false;
                        }
                        nsVar2.d.d.requestFocus();
                        nsVar2.d.d.setSelection(nsVar2.c.d.length());
                        return true;
                    default:
                        ns nsVar3 = this.b;
                        if (i13 == 6) {
                            nsVar3.a.performClick();
                            return true;
                        }
                        nsVar3.getClass();
                        return false;
                }
            }
        });
        this.b.d.setOnFocusChangeListener(new ks());
        this.b.setText(this.M);
        org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131749042, null), false, false, -1, this.r);
        this.c = m3Var2;
        m3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.a7.i(i11, this.c, p6Var);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hs
            public final /* synthetic */ ns b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 != 5) {
                            return false;
                        }
                        ns nsVar = this.b;
                        nsVar.c.d.requestFocus();
                        org.telegram.ui.Cells.k3 k3Var = nsVar.c.d;
                        k3Var.setSelection(k3Var.length());
                        return true;
                    case 1:
                        ns nsVar2 = this.b;
                        if (i13 == 6) {
                            nsVar2.a.performClick();
                            return true;
                        }
                        if (i13 != 5) {
                            return false;
                        }
                        nsVar2.d.d.requestFocus();
                        nsVar2.d.d.setSelection(nsVar2.c.d.length());
                        return true;
                    default:
                        ns nsVar3 = this.b;
                        if (i13 == 6) {
                            nsVar3.a.performClick();
                            return true;
                        }
                        nsVar3.getClass();
                        return false;
                }
            }
        });
        this.c.setText(this.N);
        org.telegram.ui.Cells.m3 m3Var3 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.cd.L0(2131754395, null), true, true, ((org.telegram.messenger.l0) getMessagesController().y7.y.a).c, this.r);
        this.d = m3Var3;
        org.telegram.ui.ActionBar.a7.H(m3Var3.d, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        int i13 = 6;
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.a7.i(i11, this.d, p6Var);
        final int i14 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hs
            public final /* synthetic */ ns b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i132, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        if (i132 != 5) {
                            return false;
                        }
                        ns nsVar = this.b;
                        nsVar.c.d.requestFocus();
                        org.telegram.ui.Cells.k3 k3Var = nsVar.c.d;
                        k3Var.setSelection(k3Var.length());
                        return true;
                    case 1:
                        ns nsVar2 = this.b;
                        if (i132 == 6) {
                            nsVar2.a.performClick();
                            return true;
                        }
                        if (i132 != 5) {
                            return false;
                        }
                        nsVar2.d.d.requestFocus();
                        nsVar2.d.d.setSelection(nsVar2.c.d.length());
                        return true;
                    default:
                        ns nsVar3 = this.b;
                        if (i132 == 6) {
                            nsVar3.a.performClick();
                            return true;
                        }
                        nsVar3.getClass();
                        return false;
                }
            }
        });
        int i15 = 28;
        if (!this.I) {
            final TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, p6Var);
            this.y = p8Var;
            p8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.a0(null, null, 2131744424, Z1.first_name), true);
            this.y.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            org.telegram.ui.Cells.p8 p8Var2 = this.y;
            int i16 = org.telegram.ui.ActionBar.t6.v6;
            int i17 = org.telegram.ui.ActionBar.t6.u6;
            p8Var2.g(i16, i17);
            final org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.photo_suggest_icon, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
            this.y.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
            this.y.e.setAnimation(bi0Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.is
                public final /* synthetic */ ns b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final ns nsVar = this.b;
                            nsVar.R = 1;
                            org.telegram.ui.Components.b40 b40Var = nsVar.P;
                            TLRPC.User user = Z1;
                            b40Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ag.f3 f3Var = new ag.f3(13);
                            final int i18 = 1;
                            final org.telegram.ui.Components.bi0 bi0Var2 = bi0Var;
                            b40Var.n(z12, f3Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ns nsVar2 = nsVar;
                                            boolean g10 = nsVar2.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var3 = bi0Var2;
                                            if (!g10) {
                                                bi0Var3.P(86);
                                                nsVar2.D.e.d();
                                                break;
                                            } else {
                                                bi0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ns nsVar3 = nsVar;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var4 = bi0Var2;
                                            if (!g11) {
                                                bi0Var4.P(85);
                                                nsVar3.y.e.d();
                                                break;
                                            } else {
                                                bi0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            bi0Var2.M(0);
                            bi0Var2.P(43);
                            nsVar.y.e.d();
                            break;
                        default:
                            final ns nsVar2 = this.b;
                            nsVar2.R = 2;
                            org.telegram.ui.Components.b40 b40Var2 = nsVar2.P;
                            TLRPC.User user2 = Z1;
                            b40Var2.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ag.f3 f3Var2 = new ag.f3(13);
                            final int i19 = 0;
                            final org.telegram.ui.Components.bi0 bi0Var3 = bi0Var;
                            b40Var2.n(z13, f3Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ns nsVar22 = nsVar2;
                                            boolean g10 = nsVar22.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var32 = bi0Var3;
                                            if (!g10) {
                                                bi0Var32.P(86);
                                                nsVar22.D.e.d();
                                                break;
                                            } else {
                                                bi0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ns nsVar3 = nsVar2;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var4 = bi0Var3;
                                            if (!g11) {
                                                bi0Var4.P(85);
                                                nsVar3.y.e.d();
                                                break;
                                            } else {
                                                bi0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            bi0Var3.M(0);
                            bi0Var3.P(43);
                            nsVar2.D.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(context, p6Var);
            this.D = p8Var3;
            p8Var3.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.a0(null, null, 2131743705, Z1.first_name), false);
            this.D.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            this.D.g(i16, i17);
            final org.telegram.ui.Components.bi0 bi0Var2 = new org.telegram.ui.Components.bi0(R.raw.camera_outline, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
            this.D.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
            this.D.e.setAnimation(bi0Var2);
            this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.is
                public final /* synthetic */ ns b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            final ns nsVar = this.b;
                            nsVar.R = 1;
                            org.telegram.ui.Components.b40 b40Var = nsVar.P;
                            TLRPC.User user = Z1;
                            b40Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ag.f3 f3Var = new ag.f3(13);
                            final int i18 = 1;
                            final org.telegram.ui.Components.bi0 bi0Var22 = bi0Var2;
                            b40Var.n(z12, f3Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ns nsVar22 = nsVar;
                                            boolean g10 = nsVar22.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var32 = bi0Var22;
                                            if (!g10) {
                                                bi0Var32.P(86);
                                                nsVar22.D.e.d();
                                                break;
                                            } else {
                                                bi0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ns nsVar3 = nsVar;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var4 = bi0Var22;
                                            if (!g11) {
                                                bi0Var4.P(85);
                                                nsVar3.y.e.d();
                                                break;
                                            } else {
                                                bi0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            bi0Var22.M(0);
                            bi0Var22.P(43);
                            nsVar.y.e.d();
                            break;
                        default:
                            final ns nsVar2 = this.b;
                            nsVar2.R = 2;
                            org.telegram.ui.Components.b40 b40Var2 = nsVar2.P;
                            TLRPC.User user2 = Z1;
                            b40Var2.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ag.f3 f3Var2 = new ag.f3(13);
                            final int i19 = 0;
                            final org.telegram.ui.Components.bi0 bi0Var3 = bi0Var2;
                            b40Var2.n(z13, f3Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ns nsVar22 = nsVar2;
                                            boolean g10 = nsVar22.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var32 = bi0Var3;
                                            if (!g10) {
                                                bi0Var32.P(86);
                                                nsVar22.D.e.d();
                                                break;
                                            } else {
                                                bi0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ns nsVar3 = nsVar2;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.bi0 bi0Var4 = bi0Var3;
                                            if (!g11) {
                                                bi0Var4.P(85);
                                                nsVar3.y.e.d();
                                                break;
                                            } else {
                                                bi0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            bi0Var3.M(0);
                            bi0Var3.P(43);
                            nsVar2.D.e.d();
                            break;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.g9(context);
            this.E = new ls(this, context, p6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.r8(0, Z1);
            }
            this.U.e(Z1.photo, this.n);
            this.E.addView(this.U, w7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(org.telegram.messenger.cd.L0(2131746105, null), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            this.E.g(i16, i17);
            this.E.setOnClickListener(new x(this, context, Z1, 10));
            org.telegram.ui.Cells.p8 p8Var4 = new org.telegram.ui.Cells.p8(context, p6Var);
            this.F = p8Var4;
            p8Var4.o(R.drawable.menu_birthday, org.telegram.messenger.cd.a0(null, null, 2131743704, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            this.F.g(i16, i17);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(org.telegram.messenger.i0.L(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.sr(i15, this, Z1));
            TLRPC.UserFull a2 = getMessagesController().a2(this.H);
            if (a2 != null) {
                TLRPC.Photo photo = a2.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = a2.fallback_photo;
                }
            }
            j0();
        }
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new z4(this, 7), new y0(this, i15), null);
        this.W = u51Var;
        u51Var.r1();
        this.W.setSectionsDrawBackground(true);
        this.W.setOnScrollListener(new bi.t3(i13, this, frameLayout));
        frameLayout.addView(this.W, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.f3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.messenger.dp dpVar;
        if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.vp.D8;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            i0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.e3 && (dpVar = (org.telegram.messenger.dp) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(dpVar.b);
            int i13 = 0;
            while (i13 < arrayList.size()) {
                if (arrayList.get(i13) == null) {
                    arrayList.remove(i13);
                    i13--;
                }
                i13++;
            }
            if (arrayList.size() > 0) {
                this.T = (TLRPC.Photo) arrayList.get(0);
                j0();
            }
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final boolean e() {
        return this.S != 1;
    }

    public final String f0() {
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
        return (Z1 == null || TextUtils.isEmpty(Z1.phone)) ? this.L : Z1.phone;
    }

    public final void g0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().n1(this.H);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i11 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i11 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i10 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new q8(this, fileLocation, inputFile2, fileLocation2, i10, 4));
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.W;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (!z11) {
            if (z10) {
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        if (z10) {
            this.s.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.x;
            RadialProgressView radialProgressView = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<kg.f0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<kg.f0, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new org.telegram.ui.Components.ha0(13, this, z10));
        this.x.start();
    }

    public final void i0() {
        TLRPC.User Z1;
        if (this.f == null || (Z1 = getMessagesController().Z1(Long.valueOf(this.H))) == null) {
            return;
        }
        if (TextUtils.isEmpty(f0())) {
            this.f.setText(org.telegram.messenger.cd.L0(2131748425, null));
        } else {
            this.f.setText(af.b.c().b("+" + f0()));
        }
        this.h.setText(org.telegram.messenger.cd.d0(this.currentAccount, Z1, null, null));
        if (this.Q == null) {
            org.telegram.ui.Components.g9 g9Var = this.e;
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(0, Z1);
            this.n = r8Var;
            g9Var.e(Z1, r8Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.j(org.telegram.messenger.ic.i(org.telegram.messenger.b8.w(photo.sizes, 1000, false, null, false), this.T), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.r8(0, Z1);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(Z1, this.n);
        } else {
            this.e.j(org.telegram.messenger.ic.e(fileLocation), "50_50", this.n, getMessagesController().Z1(Long.valueOf(this.H)));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.r);
        getNotificationCenter().c(this, org.telegram.messenger.zs.e3);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        this.K = org.telegram.messenger.vp.r1(this.currentAccount).e7.getBoolean("dialog_bar_exception" + this.H, false);
        TLRPC.User Z1 = this.H != 0 ? getMessagesController().Z1(Long.valueOf(this.H)) : null;
        org.telegram.ui.Components.b40 b40Var = this.P;
        if (b40Var != null) {
            b40Var.a = this;
            b40Var.b = this;
        }
        this.G = org.telegram.messenger.vp.r1(this.currentAccount).T0(this.H);
        return Z1 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.e3);
        org.telegram.ui.Components.b40 b40Var = this.P;
        if (b40Var != null) {
            b40Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        this.P.i();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        i0();
        this.P.k();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        TLRPC.User Z1;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (Z1 = getMessagesController().Z1(Long.valueOf(this.H))) != null) {
                this.n.r(Z1);
                this.e.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    public ns(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.r = p6Var;
        this.P = new org.telegram.ui.Components.b40(0, true, true);
    }
}
