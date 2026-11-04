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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lr extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public org.telegram.ui.Cells.l8 E;
    public jr F;
    public org.telegram.ui.Cells.l8 G;
    public org.telegram.messenger.po H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public kr P;
    public final org.telegram.ui.Components.f30 Q;
    public TLRPC.FileLocation R;
    public int S;
    public int T;
    public TLRPC.Photo U;
    public org.telegram.ui.Components.k9 V;
    public FrameLayout W;
    public org.telegram.ui.Components.l41 X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.b5 a;
    public org.telegram.messenger.zi a0;
    public org.telegram.ui.Cells.k3 b;
    public org.telegram.ui.Cells.k3 c;
    public org.telegram.ui.Cells.k3 d;
    public org.telegram.ui.Components.k9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.u8 n;
    public final org.telegram.ui.ActionBar.e6 r;
    public RadialProgressView s;
    public gi.n5 w;
    public AnimatorSet x;
    public org.telegram.ui.Cells.l8 y;

    public lr(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new org.telegram.ui.Components.f30(0, true, true);
    }

    public static /* synthetic */ void Z(lr lrVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = lrVar.getMessagesController().o1(lrVar.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(lrVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(lrVar, 5));
    }

    public static void a0(lr lrVar, TLRPC.User user) {
        lrVar.R = null;
        lrVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
        a22.photo.personal = false;
        TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(lrVar.currentAccount).b2(lrVar.I);
        if (b22 != null) {
            b22.personal_photo = null;
            b22.flags &= -2097153;
            lrVar.getMessagesStorage().j2(b22, true);
        }
        TLRPC.Photo photo = lrVar.U;
        if (photo != null) {
            a22.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null) {
                a22.photo.photo_small = w10.location;
            }
            if (w11 != null) {
                a22.photo.photo_big = w11.location;
            }
        } else {
            a22.photo = null;
            a22.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        lrVar.getMessagesStorage().m1(arrayList2, null, false, true);
        lrVar.k0();
        lrVar.getNotificationCenter().k(org.telegram.messenger.hs.c0, new Object[0]);
        lrVar.getNotificationCenter().k(org.telegram.messenger.hs.r, 2);
    }

    public static void b0(lr lrVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.f30 f30Var = lrVar.Q;
        if (f30Var.U) {
            return;
        }
        int i3 = lrVar.T;
        if (i3 == 2) {
            lrVar.R = photoSize.location;
        } else if (i3 == 1 && lrVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = lrVar.getParentLayout();
            org.telegram.ui.ActionBar.d2 lastFragment = lrVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(size);
                if (d2Var instanceof wm) {
                    wm wmVar = (wm) d2Var;
                    org.telegram.ui.ActionBar.d2 d2Var2 = lastFragment;
                    if (wmVar.a() == lrVar.I && wmVar.g4 == 0) {
                        wmVar.wb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                            if (arrayList.get(size2) != d2Var3) {
                                ((org.telegram.ui.ActionBar.d2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            d2Var2 = d2Var3;
                        }
                        d2Var2.finishFragment();
                    } else {
                        lastFragment = d2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.d2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            lrVar.e.j(org.telegram.messenger.ac.e(lrVar.R), "50_50", lrVar.n, lrVar.getMessagesController().a2(Long.valueOf(lrVar.I)));
            if (lrVar.T == 2) {
                lrVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.yy.C(lrVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.yy.E();
                tL_messageService.dialog_id = lrVar.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j10 = lrVar.getUserConfig().j();
                tL_messageService.id = j10;
                tL_messageService.local_id = j10;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = lrVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = lrVar.I;
                tL_messageService.date = lrVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(lrVar.currentAccount, tL_messageService, false, false);
                lrVar.a0 = ziVar;
                arrayList2.add(ziVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.hp.s1(lrVar.currentAccount).l5(0, lrVar.I, arrayList2);
                lrVar.getMessagesController().B7.put(tL_messageService.local_id, f30Var);
            }
        } else {
            TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
            if (lrVar.a0 == null && a22 != null) {
                boolean z11 = inputFile2 != null;
                a22.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                a22.photo = tL_userProfilePhoto;
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
                arrayList3.add(a22);
                lrVar.getMessagesStorage().m1(arrayList3, null, false, true);
                lrVar.getNotificationCenter().k(org.telegram.messenger.hs.c0, new Object[0]);
                org.telegram.messenger.hs notificationCenter = lrVar.getNotificationCenter();
                int i10 = org.telegram.messenger.hp.C8;
                notificationCenter.k(org.telegram.messenger.hs.r, 2);
            }
            lrVar.h0(lrVar.R, photoSize2.location, inputFile, inputFile2, videoSize, d, lrVar.T);
            lrVar.i0(false, true);
        }
        lrVar.k0();
    }

    public static void c0(lr lrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i3) {
        if (lrVar.a0 != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
        TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(lrVar.currentAccount).b2(lrVar.I);
        if (b22 != null) {
            b22.personal_photo = tL_photos_photo.photo;
            b22.flags |= TLObject.FLAG_21;
            lrVar.getMessagesStorage().j2(b22, true);
        }
        if (a22 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null && fileLocation != null) {
                org.telegram.messenger.w7.G(lrVar.currentAccount);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                org.telegram.messenger.w7.G(lrVar.currentAccount);
                org.telegram.messenger.w7.K(fileLocation, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String o10 = a1.g.o(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.l(lrVar.currentAccount, 1, a22));
            }
            if (w11 != null && fileLocation2 != null) {
                org.telegram.messenger.w7.G(lrVar.currentAccount);
                File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                org.telegram.messenger.w7.G(lrVar.currentAccount);
                org.telegram.messenger.w7.K(fileLocation2, null, true, true).renameTo(K2);
            }
            cg.m0.a(tL_photos_photo.photo, a22, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            lrVar.getMessagesStorage().m1(arrayList2, null, false, true);
            lrVar.getMessagesController().U0(lrVar.I);
            lrVar.getNotificationCenter().k(org.telegram.messenger.hs.c0, new Object[0]);
            lrVar.getNotificationCenter().k(org.telegram.messenger.hs.r, 2);
            if (lrVar.getParentActivity() != null) {
                if (i3 == 2) {
                    org.telegram.ui.Components.fc.a0(lrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("UserCustomPhotoSeted", null, 2131743753, a22.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.fc.a0(lrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("UserCustomPhotoSeted", null, 2131743753, a22.first_name)), null, null).j();
                }
            }
        }
        lrVar.R = null;
        lrVar.k0();
    }

    public static /* synthetic */ void d0(lr lrVar) {
        if (lrVar.a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(lrVar.a0.f1()));
            org.telegram.messenger.hs.f(lrVar.currentAccount).k(org.telegram.messenger.hs.w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.e30
    public final void T() {
        org.telegram.messenger.g0.h3(new br(this, 0));
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.cr
            @Override // java.lang.Runnable
            public final void run() {
                lr.b0(lr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        final int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.J) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748291, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751283, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hr(this));
        this.a = this.simpleActionBar.n(org.telegram.messenger.bd.M0(this.J ? 2131751753 : 2131745956, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.r;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, e6Var);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.e = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        this.W.addView(this.e, b8.mf.d(64, 64.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        int i11 = 10;
        gi.n5 n5Var = new gi.n5(this, context, paint, i11);
        this.w = n5Var;
        this.W.addView(n5Var, b8.mf.d(64, 64.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.s.setProgressColor(-1);
        final int i12 = 0;
        this.s.setNoProgress(false);
        this.W.addView(this.s, b8.mf.d(64, 64.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        this.f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = this.W;
        TextView textView3 = this.f;
        boolean z10 = org.telegram.messenger.bd.a0;
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout3, textView3, b8.mf.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = m10;
        org.telegram.ui.ActionBar.r6.V(m10, org.telegram.ui.ActionBar.k6.A6, e6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        FrameLayout frameLayout4 = this.W;
        TextView textView4 = this.h;
        boolean z11 = org.telegram.messenger.bd.a0;
        frameLayout4.addView(textView4, b8.mf.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131750695, null), false, false, -1, this.r);
        this.b = k3Var;
        k3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i10, this.b, e6Var);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.fr
            public final /* synthetic */ lr b;

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
                        lr lrVar = this.b;
                        lrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.i3 i3Var = lrVar.c.d;
                        i3Var.setSelection(i3Var.length());
                        return true;
                    case 1:
                        lr lrVar2 = this.b;
                        if (i13 == 6) {
                            lrVar2.a.performClick();
                            return true;
                        }
                        if (i13 != 5) {
                            return false;
                        }
                        lrVar2.d.d.requestFocus();
                        lrVar2.d.d.setSelection(lrVar2.c.d.length());
                        return true;
                    default:
                        lr lrVar3 = this.b;
                        if (i13 == 6) {
                            lrVar3.a.performClick();
                            return true;
                        }
                        lrVar3.getClass();
                        return false;
                }
            }
        });
        this.b.d.setOnFocusChangeListener(new ir());
        this.b.setText(this.N);
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131749040, null), false, false, -1, this.r);
        this.c = k3Var2;
        k3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i10, this.c, e6Var);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.fr
            public final /* synthetic */ lr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i13, KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        if (i13 != 5) {
                            return false;
                        }
                        lr lrVar = this.b;
                        lrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.i3 i3Var = lrVar.c.d;
                        i3Var.setSelection(i3Var.length());
                        return true;
                    case 1:
                        lr lrVar2 = this.b;
                        if (i13 == 6) {
                            lrVar2.a.performClick();
                            return true;
                        }
                        if (i13 != 5) {
                            return false;
                        }
                        lrVar2.d.d.requestFocus();
                        lrVar2.d.d.setSelection(lrVar2.c.d.length());
                        return true;
                    default:
                        lr lrVar3 = this.b;
                        if (i13 == 6) {
                            lrVar3.a.performClick();
                            return true;
                        }
                        lrVar3.getClass();
                        return false;
                }
            }
        });
        this.c.setText(this.O);
        org.telegram.ui.Cells.k3 k3Var3 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754395, null), true, true, ((org.telegram.messenger.j0) getMessagesController().x7.y.b).c, this.r);
        this.d = k3Var3;
        org.telegram.ui.ActionBar.r6.H(k3Var3.d, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        int i13 = 6;
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.i(i10, this.d, e6Var);
        final int i14 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.fr
            public final /* synthetic */ lr b;

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
                        lr lrVar = this.b;
                        lrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.i3 i3Var = lrVar.c.d;
                        i3Var.setSelection(i3Var.length());
                        return true;
                    case 1:
                        lr lrVar2 = this.b;
                        if (i132 == 6) {
                            lrVar2.a.performClick();
                            return true;
                        }
                        if (i132 != 5) {
                            return false;
                        }
                        lrVar2.d.d.requestFocus();
                        lrVar2.d.d.setSelection(lrVar2.c.d.length());
                        return true;
                    default:
                        lr lrVar3 = this.b;
                        if (i132 == 6) {
                            lrVar3.a.performClick();
                            return true;
                        }
                        lrVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.J) {
            final TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, e6Var);
            this.y = l8Var;
            l8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.a0(null, null, 2131744408, a22.first_name), true);
            this.y.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            org.telegram.ui.Cells.l8 l8Var2 = this.y;
            int i15 = org.telegram.ui.ActionBar.k6.v6;
            int i16 = org.telegram.ui.ActionBar.k6.u6;
            l8Var2.g(i15, i16);
            final org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.photo_suggest_icon, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.y.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.y.e.setAnimation(ch0Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gr
                public final /* synthetic */ lr b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final lr lrVar = this.b;
                            lrVar.S = 1;
                            org.telegram.ui.Components.f30 f30Var = lrVar.Q;
                            TLRPC.User user = a22;
                            f30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ai.y1 y1Var = new ai.y1(26);
                            final int i17 = 1;
                            final org.telegram.ui.Components.ch0 ch0Var2 = ch0Var;
                            f30Var.n(z12, y1Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.er
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i17) {
                                        case 0:
                                            lr lrVar2 = lrVar;
                                            boolean g7 = lrVar2.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var3 = ch0Var2;
                                            if (!g7) {
                                                ch0Var3.P(86);
                                                lrVar2.E.e.d();
                                                break;
                                            } else {
                                                ch0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            lr lrVar3 = lrVar;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var2;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.y.e.d();
                                                break;
                                            } else {
                                                ch0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            ch0Var2.M(0);
                            ch0Var2.P(43);
                            lrVar.y.e.d();
                            break;
                        default:
                            final lr lrVar2 = this.b;
                            lrVar2.S = 2;
                            org.telegram.ui.Components.f30 f30Var2 = lrVar2.Q;
                            TLRPC.User user2 = a22;
                            f30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ai.y1 y1Var2 = new ai.y1(26);
                            final int i18 = 0;
                            final org.telegram.ui.Components.ch0 ch0Var3 = ch0Var;
                            f30Var2.n(z13, y1Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.er
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            lr lrVar22 = lrVar2;
                                            boolean g7 = lrVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var3;
                                            if (!g7) {
                                                ch0Var32.P(86);
                                                lrVar22.E.e.d();
                                                break;
                                            } else {
                                                ch0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            lr lrVar3 = lrVar2;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var3;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.y.e.d();
                                                break;
                                            } else {
                                                ch0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            ch0Var3.M(0);
                            ch0Var3.P(43);
                            lrVar2.E.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(context, e6Var);
            this.E = l8Var3;
            l8Var3.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.a0(null, null, 2131743689, a22.first_name), false);
            this.E.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            this.E.g(i15, i16);
            final org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.E.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.E.e.setAnimation(ch0Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gr
                public final /* synthetic */ lr b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            final lr lrVar = this.b;
                            lrVar.S = 1;
                            org.telegram.ui.Components.f30 f30Var = lrVar.Q;
                            TLRPC.User user = a22;
                            f30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ai.y1 y1Var = new ai.y1(26);
                            final int i17 = 1;
                            final org.telegram.ui.Components.ch0 ch0Var22 = ch0Var2;
                            f30Var.n(z12, y1Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.er
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i17) {
                                        case 0:
                                            lr lrVar22 = lrVar;
                                            boolean g7 = lrVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var22;
                                            if (!g7) {
                                                ch0Var32.P(86);
                                                lrVar22.E.e.d();
                                                break;
                                            } else {
                                                ch0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            lr lrVar3 = lrVar;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var22;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.y.e.d();
                                                break;
                                            } else {
                                                ch0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            ch0Var22.M(0);
                            ch0Var22.P(43);
                            lrVar.y.e.d();
                            break;
                        default:
                            final lr lrVar2 = this.b;
                            lrVar2.S = 2;
                            org.telegram.ui.Components.f30 f30Var2 = lrVar2.Q;
                            TLRPC.User user2 = a22;
                            f30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ai.y1 y1Var2 = new ai.y1(26);
                            final int i18 = 0;
                            final org.telegram.ui.Components.ch0 ch0Var3 = ch0Var2;
                            f30Var2.n(z13, y1Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.er
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            lr lrVar22 = lrVar2;
                                            boolean g7 = lrVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var3;
                                            if (!g7) {
                                                ch0Var32.P(86);
                                                lrVar22.E.e.d();
                                                break;
                                            } else {
                                                ch0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            lr lrVar3 = lrVar2;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var3;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.y.e.d();
                                                break;
                                            } else {
                                                ch0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            ch0Var3.M(0);
                            ch0Var3.P(43);
                            lrVar2.E.e.d();
                            break;
                    }
                }
            });
            this.V = new org.telegram.ui.Components.k9(context);
            this.F = new jr(this, context, e6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.u8(0, a22);
            }
            this.V.e(a22.photo, this.n);
            this.F.addView(this.V, b8.mf.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(org.telegram.messenger.bd.M0(2131746098, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            this.F.g(i15, i16);
            this.F.setOnClickListener(new a0(this, context, a22, i11));
            org.telegram.ui.Cells.l8 l8Var4 = new org.telegram.ui.Cells.l8(context, e6Var);
            this.G = l8Var4;
            l8Var4.o(R.drawable.menu_birthday, org.telegram.messenger.bd.a0(null, null, 2131743688, new Object[0]), false);
            this.G.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            this.G.g(i15, i16);
            this.G.setNeedDivider(true);
            this.G.e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.G.setOnClickListener(new org.telegram.ui.Components.ux0(11, this, a22));
            TLRPC.UserFull b22 = getMessagesController().b2(this.I);
            if (b22 != null) {
                TLRPC.Photo photo = b22.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = b22.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new c5(this, 7), new x0(this, 29), null);
        this.X = l41Var;
        l41Var.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new ai.i4(i13, this, frameLayout));
        frameLayout.addView(this.X, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.messenger.po poVar;
        if (i3 == org.telegram.messenger.hs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            j0();
            return;
        }
        if (i3 == org.telegram.messenger.hs.e3 && (poVar = (org.telegram.messenger.po) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(poVar.b);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final boolean e() {
        return this.T != 1;
    }

    public final String g0() {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
        return (a22 == null || TextUtils.isEmpty(a22.phone)) ? this.M : a22.phone;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i3) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().o1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i3 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new cg.j0(this, fileLocation, inputFile2, fileLocation2, i3, 9));
    }

    public final void i0(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<gi.n5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<gi.n5, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new org.telegram.ui.Components.s9(27, this, z10));
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User a22;
        if (this.f == null || (a22 = getMessagesController().a2(Long.valueOf(this.I))) == null) {
            return;
        }
        if (TextUtils.isEmpty(g0())) {
            this.f.setText(org.telegram.messenger.bd.M0(2131748418, null));
        } else {
            this.f.setText(mf.b.c().b("+" + g0()));
        }
        this.h.setText(org.telegram.messenger.bd.d0(this.currentAccount, a22, null, null));
        if (this.R == null) {
            org.telegram.ui.Components.k9 k9Var = this.e;
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(0, a22);
            this.n = u8Var;
            k9Var.e(a22, u8Var);
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.j(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.u8(0, a22);
        }
        TLRPC.FileLocation fileLocation = this.R;
        if (fileLocation == null) {
            this.e.e(a22, this.n);
        } else {
            this.e.j(org.telegram.messenger.ac.e(fileLocation), "50_50", this.n, getMessagesController().a2(Long.valueOf(this.I)));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.e3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        this.L = org.telegram.messenger.hp.s1(this.currentAccount).d7.getBoolean("dialog_bar_exception" + this.I, false);
        TLRPC.User a22 = this.I != 0 ? getMessagesController().a2(Long.valueOf(this.I)) : null;
        org.telegram.ui.Components.f30 f30Var = this.Q;
        if (f30Var != null) {
            f30Var.a = this;
            f30Var.b = this;
        }
        this.H = org.telegram.messenger.hp.s1(this.currentAccount).U0(this.I);
        return a22 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.e3);
        org.telegram.ui.Components.f30 f30Var = this.Q;
        if (f30Var != null) {
            f30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        j0();
        this.Q.k();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        TLRPC.User a22;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (a22 = getMessagesController().a2(Long.valueOf(this.I))) != null) {
                this.n.r(a22);
                this.e.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public lr(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.r = e6Var;
        this.Q = new org.telegram.ui.Components.f30(0, true, true);
    }
}
