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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class nr extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public org.telegram.ui.Cells.m8 D;
    public lr E;
    public org.telegram.ui.Cells.m8 F;
    public org.telegram.messenger.yo G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public mr O;
    public final org.telegram.ui.Components.j30 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.l9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.q41 W;
    public boolean X;
    public boolean Y;
    public org.telegram.messenger.ij Z;
    public org.telegram.ui.ActionBar.b5 a;
    public org.telegram.ui.Cells.k3 b;
    public org.telegram.ui.Cells.k3 c;
    public org.telegram.ui.Cells.k3 d;
    public org.telegram.ui.Components.l9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.w8 n;
    public final org.telegram.ui.ActionBar.f6 r;
    public RadialProgressView s;
    public fi.p5 w;
    public AnimatorSet x;
    public org.telegram.ui.Cells.m8 y;

    public nr(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.j30(0, true, true);
    }

    public static /* synthetic */ void Z(nr nrVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = nrVar.getMessagesController().o1(nrVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(nrVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(nrVar, 5));
    }

    public static void a0(nr nrVar, TLRPC.User user) {
        nrVar.Q = null;
        nrVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
        a22.photo.personal = false;
        TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(nrVar.currentAccount).b2(nrVar.H);
        if (b22 != null) {
            b22.personal_photo = null;
            b22.flags &= -2097153;
            nrVar.getMessagesStorage().j2(b22, true);
        }
        TLRPC.Photo photo = nrVar.T;
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
        nrVar.getMessagesStorage().m1(arrayList2, null, false, true);
        nrVar.k0();
        nrVar.getNotificationCenter().k(org.telegram.messenger.qs.c0, new Object[0]);
        nrVar.getNotificationCenter().k(org.telegram.messenger.qs.r, 2);
    }

    public static void b0(nr nrVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z9) {
        org.telegram.ui.Components.j30 j30Var = nrVar.P;
        if (j30Var.T) {
            return;
        }
        int i7 = nrVar.S;
        if (i7 == 2) {
            nrVar.Q = photoSize.location;
        } else if (i7 == 1 && nrVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = nrVar.getParentLayout();
            org.telegram.ui.ActionBar.f2 lastFragment = nrVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                if (f2Var instanceof an) {
                    an anVar = (an) f2Var;
                    org.telegram.ui.ActionBar.f2 f2Var2 = lastFragment;
                    if (anVar.a() == nrVar.H && anVar.f4 == 0) {
                        anVar.wb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                            if (arrayList.get(size2) != f2Var3) {
                                ((org.telegram.ui.ActionBar.f2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            f2Var2 = f2Var3;
                        }
                        f2Var2.finishFragment();
                    } else {
                        lastFragment = f2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.f2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            nrVar.e.j(org.telegram.messenger.hc.e(nrVar.Q), "50_50", nrVar.n, nrVar.getMessagesController().a2(Long.valueOf(nrVar.H)));
            if (nrVar.S == 2) {
                nrVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.gz.C(nrVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.gz.E();
                tL_messageService.dialog_id = nrVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j3 = nrVar.getUserConfig().j();
                tL_messageService.id = j3;
                tL_messageService.local_id = j3;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = nrVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = nrVar.H;
                tL_messageService.date = nrVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z9;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(nrVar.currentAccount, tL_messageService, false, false);
                nrVar.Z = ijVar;
                arrayList2.add(ijVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.qp.s1(nrVar.currentAccount).l5(0, nrVar.H, arrayList2);
                nrVar.getMessagesController().B7.put(tL_messageService.local_id, j30Var);
            }
        } else {
            TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
            if (nrVar.Z == null && a22 != null) {
                boolean z10 = inputFile2 != null;
                a22.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                a22.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z10;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(a22);
                nrVar.getMessagesStorage().m1(arrayList3, null, false, true);
                nrVar.getNotificationCenter().k(org.telegram.messenger.qs.c0, new Object[0]);
                org.telegram.messenger.qs notificationCenter = nrVar.getNotificationCenter();
                int i10 = org.telegram.messenger.qp.C8;
                notificationCenter.k(org.telegram.messenger.qs.r, 2);
            }
            nrVar.h0(nrVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, nrVar.S);
            nrVar.i0(false, true);
        }
        nrVar.k0();
    }

    public static void c0(nr nrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        if (nrVar.Z != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
        TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(nrVar.currentAccount).b2(nrVar.H);
        if (b22 != null) {
            b22.personal_photo = tL_photos_photo.photo;
            b22.flags |= TLObject.FLAG_21;
            nrVar.getMessagesStorage().j2(b22, true);
        }
        if (a22 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null && fileLocation != null) {
                org.telegram.messenger.w7.G(nrVar.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(nrVar.currentAccount);
                org.telegram.messenger.w7.J(fileLocation, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.l(nrVar.currentAccount, 1, a22));
            }
            if (w11 != null && fileLocation2 != null) {
                org.telegram.messenger.w7.G(nrVar.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(nrVar.currentAccount);
                org.telegram.messenger.w7.J(fileLocation2, null, true, true).renameTo(J2);
            }
            bg.n0.a(tL_photos_photo.photo, a22, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a22);
            nrVar.getMessagesStorage().m1(arrayList2, null, false, true);
            nrVar.getMessagesController().U0(nrVar.H);
            nrVar.getNotificationCenter().k(org.telegram.messenger.qs.c0, new Object[0]);
            nrVar.getNotificationCenter().k(org.telegram.messenger.qs.r, 2);
            if (nrVar.getParentActivity() != null) {
                if (i7 == 2) {
                    org.telegram.ui.Components.hc.a0(nrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("UserCustomPhotoSeted", null, 2131743744, a22.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.hc.a0(nrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("UserCustomPhotoSeted", null, 2131743744, a22.first_name)), null, null).j();
                }
            }
        }
        nrVar.Q = null;
        nrVar.k0();
    }

    public static /* synthetic */ void d0(nr nrVar) {
        if (nrVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(nrVar.Z.f1()));
            org.telegram.messenger.qs.f(nrVar.currentAccount).k(org.telegram.messenger.qs.w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.i30
    public final void T() {
        org.telegram.messenger.g0.h3(new dr(this, 0));
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.er
            @Override // java.lang.Runnable
            public final void run() {
                nr.b0(nr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z9);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        final int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.I) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748282, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751283, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new jr(this));
        this.a = this.simpleActionBar.n(org.telegram.messenger.hd.M0(this.I ? 2131751753 : 2131745947, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, f6Var);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        int i11 = 5;
        this.V.addView(this.e, c8.ha.d(64, 64.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        int i12 = 10;
        fi.p5 p5Var = new fi.p5(this, context, paint, i12);
        this.w = p5Var;
        this.V.addView(p5Var, c8.ha.d(64, 64.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.s.setProgressColor(-1);
        final int i13 = 0;
        this.s.setNoProgress(false);
        this.V.addView(this.s, c8.ha.d(64, 64.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        this.f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout3 = this.V;
        TextView textView3 = this.f;
        boolean z9 = org.telegram.messenger.hd.a0;
        TextView i14 = org.telegram.ui.Cells.f1.i(frameLayout3, textView3, c8.ha.d(-2, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 94.0f, 25.66f, z9 ? 94.0f : 0.0f, 0.0f), context);
        this.h = i14;
        org.telegram.ui.ActionBar.r6.V(i14, org.telegram.ui.ActionBar.k6.A6, f6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        FrameLayout frameLayout4 = this.V;
        TextView textView4 = this.h;
        boolean z10 = org.telegram.messenger.hd.a0;
        frameLayout4.addView(textView4, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 49.66f, z10 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131750695, null), false, false, -1, this.r);
        this.b = k3Var;
        k3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i10, this.b, f6Var);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hr
            public final /* synthetic */ nr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i15 != 5) {
                            return false;
                        }
                        nr nrVar = this.b;
                        nrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.i3 i3Var = nrVar.c.d;
                        i3Var.setSelection(i3Var.length());
                        return true;
                    case 1:
                        nr nrVar2 = this.b;
                        if (i15 == 6) {
                            nrVar2.a.performClick();
                            return true;
                        }
                        if (i15 != 5) {
                            return false;
                        }
                        nrVar2.d.d.requestFocus();
                        nrVar2.d.d.setSelection(nrVar2.c.d.length());
                        return true;
                    default:
                        nr nrVar3 = this.b;
                        if (i15 == 6) {
                            nrVar3.a.performClick();
                            return true;
                        }
                        nrVar3.getClass();
                        return false;
                }
            }
        });
        this.b.d.setOnFocusChangeListener(new kr());
        this.b.setText(this.M);
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131749031, null), false, false, -1, this.r);
        this.c = k3Var2;
        k3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i10, this.c, f6Var);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hr
            public final /* synthetic */ nr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        if (i15 != 5) {
                            return false;
                        }
                        nr nrVar = this.b;
                        nrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.i3 i3Var = nrVar.c.d;
                        i3Var.setSelection(i3Var.length());
                        return true;
                    case 1:
                        nr nrVar2 = this.b;
                        if (i15 == 6) {
                            nrVar2.a.performClick();
                            return true;
                        }
                        if (i15 != 5) {
                            return false;
                        }
                        nrVar2.d.d.requestFocus();
                        nrVar2.d.d.setSelection(nrVar2.c.d.length());
                        return true;
                    default:
                        nr nrVar3 = this.b;
                        if (i15 == 6) {
                            nrVar3.a.performClick();
                            return true;
                        }
                        nrVar3.getClass();
                        return false;
                }
            }
        });
        this.c.setText(this.N);
        org.telegram.ui.Cells.k3 k3Var3 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754395, null), true, true, ((org.telegram.messenger.j0) getMessagesController().x7.y.b).c, this.r);
        this.d = k3Var3;
        org.telegram.ui.ActionBar.r6.H(k3Var3.d, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.i(i10, this.d, f6Var);
        final int i15 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.hr
            public final /* synthetic */ nr b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i152, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i152 != 5) {
                            return false;
                        }
                        nr nrVar = this.b;
                        nrVar.c.d.requestFocus();
                        org.telegram.ui.Cells.i3 i3Var = nrVar.c.d;
                        i3Var.setSelection(i3Var.length());
                        return true;
                    case 1:
                        nr nrVar2 = this.b;
                        if (i152 == 6) {
                            nrVar2.a.performClick();
                            return true;
                        }
                        if (i152 != 5) {
                            return false;
                        }
                        nrVar2.d.d.requestFocus();
                        nrVar2.d.d.setSelection(nrVar2.c.d.length());
                        return true;
                    default:
                        nr nrVar3 = this.b;
                        if (i152 == 6) {
                            nrVar3.a.performClick();
                            return true;
                        }
                        nrVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, f6Var);
            this.y = m8Var;
            m8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.a0(null, null, 2131744399, a22.first_name), true);
            this.y.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            org.telegram.ui.Cells.m8 m8Var2 = this.y;
            int i16 = org.telegram.ui.ActionBar.k6.v6;
            int i17 = org.telegram.ui.ActionBar.k6.u6;
            m8Var2.g(i16, i17);
            final org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.photo_suggest_icon, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.y.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.y.e.setAnimation(zg0Var);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ir
                public final /* synthetic */ nr b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            final nr nrVar = this.b;
                            nrVar.R = 1;
                            org.telegram.ui.Components.j30 j30Var = nrVar.P;
                            TLRPC.User user = a22;
                            j30Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z11 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ai.m0 m0Var = new ai.m0(22);
                            final int i18 = 1;
                            final org.telegram.ui.Components.zg0 zg0Var2 = zg0Var;
                            j30Var.n(z11, m0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            nr nrVar2 = nrVar;
                                            boolean g10 = nrVar2.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var3 = zg0Var2;
                                            if (!g10) {
                                                zg0Var3.P(86);
                                                nrVar2.D.e.d();
                                                break;
                                            } else {
                                                zg0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            nr nrVar3 = nrVar;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var2;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.y.e.d();
                                                break;
                                            } else {
                                                zg0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            zg0Var2.M(0);
                            zg0Var2.P(43);
                            nrVar.y.e.d();
                            break;
                        default:
                            final nr nrVar2 = this.b;
                            nrVar2.R = 2;
                            org.telegram.ui.Components.j30 j30Var2 = nrVar2.P;
                            TLRPC.User user2 = a22;
                            j30Var2.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z12 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ai.m0 m0Var2 = new ai.m0(22);
                            final int i19 = 0;
                            final org.telegram.ui.Components.zg0 zg0Var3 = zg0Var;
                            j30Var2.n(z12, m0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            nr nrVar22 = nrVar2;
                                            boolean g10 = nrVar22.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var32 = zg0Var3;
                                            if (!g10) {
                                                zg0Var32.P(86);
                                                nrVar22.D.e.d();
                                                break;
                                            } else {
                                                zg0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            nr nrVar3 = nrVar2;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var3;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.y.e.d();
                                                break;
                                            } else {
                                                zg0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            zg0Var3.M(0);
                            zg0Var3.P(43);
                            nrVar2.D.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(context, f6Var);
            this.D = m8Var3;
            m8Var3.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.a0(null, null, 2131743680, a22.first_name), false);
            this.D.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            this.D.g(i16, i17);
            final org.telegram.ui.Components.zg0 zg0Var2 = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.D.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.D.e.setAnimation(zg0Var2);
            this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ir
                public final /* synthetic */ nr b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            final nr nrVar = this.b;
                            nrVar.R = 1;
                            org.telegram.ui.Components.j30 j30Var = nrVar.P;
                            TLRPC.User user = a22;
                            j30Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            boolean z11 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ai.m0 m0Var = new ai.m0(22);
                            final int i18 = 1;
                            final org.telegram.ui.Components.zg0 zg0Var22 = zg0Var2;
                            j30Var.n(z11, m0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            nr nrVar22 = nrVar;
                                            boolean g10 = nrVar22.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var32 = zg0Var22;
                                            if (!g10) {
                                                zg0Var32.P(86);
                                                nrVar22.D.e.d();
                                                break;
                                            } else {
                                                zg0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            nr nrVar3 = nrVar;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var22;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.y.e.d();
                                                break;
                                            } else {
                                                zg0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            zg0Var22.M(0);
                            zg0Var22.P(43);
                            nrVar.y.e.d();
                            break;
                        default:
                            final nr nrVar2 = this.b;
                            nrVar2.R = 2;
                            org.telegram.ui.Components.j30 j30Var2 = nrVar2.P;
                            TLRPC.User user2 = a22;
                            j30Var2.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            boolean z12 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ai.m0 m0Var2 = new ai.m0(22);
                            final int i19 = 0;
                            final org.telegram.ui.Components.zg0 zg0Var3 = zg0Var2;
                            j30Var2.n(z12, m0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.gr
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            nr nrVar22 = nrVar2;
                                            boolean g10 = nrVar22.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var32 = zg0Var3;
                                            if (!g10) {
                                                zg0Var32.P(86);
                                                nrVar22.D.e.d();
                                                break;
                                            } else {
                                                zg0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            nr nrVar3 = nrVar2;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var3;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.y.e.d();
                                                break;
                                            } else {
                                                zg0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            zg0Var3.M(0);
                            zg0Var3.P(43);
                            nrVar2.D.e.d();
                            break;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.l9(context);
            this.E = new lr(this, context, f6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.w8(0, a22);
            }
            this.U.e(a22.photo, this.n);
            this.E.addView(this.U, c8.ha.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(org.telegram.messenger.hd.M0(2131746089, null), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            this.E.g(i16, i17);
            this.E.setOnClickListener(new z(this, context, a22, i12));
            org.telegram.ui.Cells.m8 m8Var4 = new org.telegram.ui.Cells.m8(context, f6Var);
            this.F = m8Var4;
            m8Var4.o(R.drawable.menu_birthday, org.telegram.messenger.hd.a0(null, null, 2131743679, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            this.F.g(i16, i17);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.t41(i11, this, a22));
            TLRPC.UserFull b22 = getMessagesController().b2(this.H);
            if (b22 != null) {
                TLRPC.Photo photo = b22.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = b22.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new a5(this, 7), new w0(this, 29), null);
        this.W = q41Var;
        q41Var.r1();
        this.W.setSectionsDrawBackground(true);
        this.W.setOnScrollListener(new ai.o0(i11, this, frameLayout));
        frameLayout.addView(this.W, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.f3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.yo yoVar;
        if (i7 == org.telegram.messenger.qs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 2) == 0 && (intValue & 4) == 0) {
                return;
            }
            j0();
            return;
        }
        if (i7 == org.telegram.messenger.qs.e3 && (yoVar = (org.telegram.messenger.yo) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(yoVar.b);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.T = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final boolean e() {
        return this.S != 1;
    }

    public final String g0() {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
        return (a22 == null || TextUtils.isEmpty(a22.phone)) ? this.L : a22.phone;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.W;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i7) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().o1(this.H);
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
        if (i7 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new bg.k0(this, fileLocation, inputFile2, fileLocation2, i7, 9));
    }

    public final void i0(boolean z9, boolean z10) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (!z10) {
            if (z9) {
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
        if (z9) {
            this.s.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.x;
            RadialProgressView radialProgressView = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<fi.p5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<fi.p5, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new org.telegram.ui.Components.t9(27, this, z9));
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User a22;
        if (this.f == null || (a22 = getMessagesController().a2(Long.valueOf(this.H))) == null) {
            return;
        }
        if (TextUtils.isEmpty(g0())) {
            this.f.setText(org.telegram.messenger.hd.M0(2131748409, null));
        } else {
            this.f.setText(pf.b.c().b("+" + g0()));
        }
        this.h.setText(org.telegram.messenger.hd.d0(this.currentAccount, a22, null, null));
        if (this.Q == null) {
            org.telegram.ui.Components.l9 l9Var = this.e;
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(0, a22);
            this.n = w8Var;
            l9Var.e(a22, w8Var);
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.j(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.T), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.w8(0, a22);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(a22, this.n);
        } else {
            this.e.j(org.telegram.messenger.hc.e(fileLocation), "50_50", this.n, getMessagesController().a2(Long.valueOf(this.H)));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.e3);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        this.K = org.telegram.messenger.qp.s1(this.currentAccount).d7.getBoolean("dialog_bar_exception" + this.H, false);
        TLRPC.User a22 = this.H != 0 ? getMessagesController().a2(Long.valueOf(this.H)) : null;
        org.telegram.ui.Components.j30 j30Var = this.P;
        if (j30Var != null) {
            j30Var.a = this;
            j30Var.b = this;
        }
        this.G = org.telegram.messenger.qp.s1(this.currentAccount).U0(this.H);
        return a22 != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.e3);
        org.telegram.ui.Components.j30 j30Var = this.P;
        if (j30Var != null) {
            j30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        this.P.i();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        j0();
        this.P.k();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        TLRPC.User a22;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (a22 = getMessagesController().a2(Long.valueOf(this.H))) != null) {
                this.n.r(a22);
                this.e.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public nr(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.r = f6Var;
        this.P = new org.telegram.ui.Components.j30(0, true, true);
    }
}
