package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public final tn B;
    public int C;
    public boolean D;
    public org.telegram.ui.ActionBar.o1 E;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout F;
    public org.telegram.ui.ActionBar.g1[] G;
    public FrameLayout H;
    public org.telegram.ui.Components.au I;
    public n0 J;
    public ImageView K;
    public cp0 L;
    public cg.h0 M;
    public View N;
    public final TextPaint O;
    public final RectF P;
    public final Paint Q;
    public gp0 R;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.jl0 h;
    public fp0 n;
    public FrameLayout r;
    public TextView s;
    public boolean v;
    public final int w;
    public boolean x;
    public final boolean y;

    public hp0(int i10, boolean z10, boolean z11, tn tnVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.x = true;
        this.D = true;
        this.O = new TextPaint(1);
        this.P = new RectF();
        this.Q = new Paint(1);
        this.B = tnVar;
        this.w = i10;
        this.y = z10;
        this.A = z11;
    }

    public static void U(hp0 hp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            zp0 zp0Var = new zp0(0, albumEntry, hp0Var.b, hp0Var.c, hp0Var.w, hp0Var.A, hp0Var.B, false);
            Editable text = hp0Var.I.getText();
            hp0Var.a = text;
            zp0Var.d = text;
            org.telegram.ui.Components.au auVar = zp0Var.Z;
            if (auVar != null) {
                auVar.setText(text);
            }
            zp0Var.o0 = new dp0(hp0Var);
            zp0Var.f0(hp0Var.C, hp0Var.D);
            hp0Var.presentFragment(zp0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!hp0Var.y) {
            zp0 zp0Var2 = new zp0(0, albumEntry, hashMap, arrayList, hp0Var.w, hp0Var.A, hp0Var.B, false);
            Editable text2 = hp0Var.I.getText();
            hp0Var.a = text2;
            zp0Var2.d = text2;
            org.telegram.ui.Components.au auVar2 = zp0Var2.Z;
            if (auVar2 != null) {
                auVar2.setText(text2);
            }
            zp0Var2.o0 = new ap0(hp0Var, hashMap, arrayList);
            zp0Var2.f0(hp0Var.C, hp0Var.D);
            hp0Var.presentFragment(zp0Var2);
            return;
        }
        eq0 eq0Var = new eq0(hashMap, arrayList, hp0Var.w, hp0Var.A, hp0Var.B);
        Editable text3 = hp0Var.I.getText();
        hp0Var.a = text3;
        zp0 zp0Var3 = eq0Var.a;
        if (zp0Var3 != null) {
            zp0Var3.d = text3;
            org.telegram.ui.Components.au auVar3 = zp0Var3.Z;
            if (auVar3 != null) {
                auVar3.setText(text3);
            }
        }
        ep0 ep0Var = new ep0(hp0Var, hashMap, arrayList);
        zp0 zp0Var4 = eq0Var.a;
        zp0Var4.o0 = ep0Var;
        zp0 zp0Var5 = eq0Var.b;
        zp0Var5.o0 = ep0Var;
        zp0Var4.p0 = new dq0(eq0Var, 0);
        zp0Var5.p0 = new dq0(eq0Var, 1);
        int i10 = hp0Var.C;
        boolean z10 = hp0Var.D;
        zp0Var4.f0(i10, z10);
        eq0Var.b.f0(i10, z10);
        hp0Var.presentFragment(eq0Var);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (hashMap.isEmpty() || this.R == null || this.v) {
            return;
        }
        this.v = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            } else if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str2 = searchImage.imagePath;
                if (str2 != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                sendingMediaInfo.coverPath = searchImage.coverPath;
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                CharSequence charSequence2 = searchImage.caption;
                sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                sendingMediaInfo.entities = searchImage.entities;
                sendingMediaInfo.masks = searchImage.stickers;
                sendingMediaInfo.ttl = searchImage.ttl;
                TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                if (botInlineResult != null && searchImage.type == 1) {
                    sendingMediaInfo.inlineResult = botInlineResult;
                    sendingMediaInfo.params = searchImage.params;
                }
                searchImage.date = (int) (System.currentTimeMillis() / 1000);
            }
        }
        this.R.a(arrayList2);
    }

    public final void W(boolean z10) {
        if (z10 == (this.H.getTag() != null)) {
            return;
        }
        this.H.setTag(z10 ? 1 : null);
        if (this.I.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.I.getEditText());
        }
        this.I.k(true);
        if (z10) {
            this.H.setVisibility(0);
            this.J.setVisibility(0);
        } else {
            this.H.setVisibility(4);
            this.J.setVisibility(4);
        }
        this.J.setScaleX(z10 ? 1.0f : 0.2f);
        this.J.setScaleY(z10 ? 1.0f : 0.2f);
        this.J.setAlpha(z10 ? 1.0f : 0.0f);
        this.M.setScaleX(z10 ? 1.0f : 0.2f);
        this.M.setScaleY(z10 ? 1.0f : 0.2f);
        this.M.setAlpha(z10 ? 1.0f : 0.0f);
        this.H.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
        this.N.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        lVar2.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new bp0(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        if (this.x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        cp0 cp0Var = new cp0(this, context);
        this.L = cp0Var;
        cp0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView = this.L;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.h = jl0Var;
        jl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.j0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.L.addView(this.h, i7.f6.e(-1, -1, 51));
        org.telegram.ui.Components.jl0 jl0Var2 = this.h;
        fp0 fp0Var = new fp0(this, context);
        this.n = fp0Var;
        jl0Var2.setAdapter(fp0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(LocaleController.getString(R.string.NoPhotos));
        this.L.addView(this.s, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new mh.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.L.addView(this.r, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, i7.f6.e(-2, -2, 17));
        View view = new View(context);
        this.N = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.N.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.N, i7.f6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.H.setVisibility(4);
        this.H.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.H, i7.f6.e(-1, 48, 83));
        this.H.setOnTouchListener(new mh.d(2));
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null) {
            auVar.o();
        }
        this.I = new org.telegram.ui.Components.au(context, this.L, null, 1, false, null);
        this.I.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.I.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.st editText = this.I.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.H.addView(this.I, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.I.setText(charSequence);
        }
        n0 n0Var = new n0(this, context, 16);
        this.J = n0Var;
        n0Var.setFocusable(true);
        this.J.setFocusableInTouchMode(true);
        this.J.setVisibility(4);
        this.J.setScaleX(0.2f);
        this.J.setScaleY(0.2f);
        this.J.setAlpha(0.0f);
        this.L.addView(this.J, i7.f6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.K = new ImageView(context);
        this.K.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T5, false)));
        this.K.setImageResource(R.drawable.attach_send);
        this.K.setImportantForAccessibility(2);
        this.K.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.K.setScaleType(ImageView.ScaleType.CENTER);
        this.K.setOutlineProvider(new eg.k1(17));
        this.J.addView(this.K, i7.f6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.K.setOnClickListener(new t50(this, 18));
        this.K.setOnLongClickListener(new w(this, 3));
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.O;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        cg.h0 h0Var = new cg.h0(this, context, 29);
        this.M = h0Var;
        h0Var.setAlpha(0.0f);
        this.M.setScaleX(0.2f);
        this.M.setScaleY(0.2f);
        this.L.addView(this.M, i7.f6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.w != 0) {
            this.I.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.albumsDidLoad) {
            if (i10 == NotificationCenter.closeChats) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i12 = this.w;
            if (i12 == 1 || i12 == 2 || i12 == 10 || !this.x) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            org.telegram.ui.Components.jl0 jl0Var = this.h;
            if (jl0Var != null && jl0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            fp0 fp0Var = this.n;
            if (fp0Var != null) {
                fp0Var.l();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar == null || !auVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        auVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.jl0 jl0Var = this.h;
        if (jl0Var != null) {
            jl0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        int i10 = this.w;
        if (i10 == 1 || i10 == 2 || i10 == 10 || !this.x) {
            this.d = MediaController.allPhotoAlbums;
        } else {
            this.d = MediaController.allMediaAlbums;
        }
        this.e = this.d == null;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null) {
            auVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        fp0 fp0Var = this.n;
        if (fp0Var != null) {
            fp0Var.l();
        }
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null) {
            auVar.s();
        }
        org.telegram.ui.Components.jl0 jl0Var = this.h;
        if (jl0Var != null) {
            jl0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 3));
        }
    }
}
