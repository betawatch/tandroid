package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class o3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final d3 F;
    public final org.telegram.ui.ActionBar.w0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.h6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int a;
    public Utilities.Callback3 a0;
    public final org.telegram.ui.ActionBar.u6 b;
    public final ArrayList b0;
    public final Paint c;
    public boolean c0;
    public final x2 d;
    public boolean d0;
    public final y2 e;
    public MediaController.AlbumEntry e0;
    public final h3 f;
    public ArrayList f0;
    public ArrayList g0;
    public final FrameLayout h;
    public final ArrayList h0;
    public di.i4 i0;
    public final mm0 n;
    public final e3 r;
    public final ey0 s;
    public final z3 v;
    public boolean w;
    public final org.telegram.ui.ActionBar.k x;
    public final TextView y;

    public o3(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = new ArrayList();
        this.O = f7;
        this.a = i10;
        this.b = u6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), TLObject.FLAG_27);
        x2 x2Var = new x2(this, context, u6Var);
        this.d = x2Var;
        x2Var.setItemSelectorColorProvider(new c2.i(19));
        h3 h3Var = new h3(this);
        this.f = h3Var;
        x2Var.setAdapter(h3Var);
        y2 y2Var = new y2(this);
        this.e = y2Var;
        x2Var.setLayoutManager(y2Var);
        x2Var.setFastScrollEnabled(1);
        x2Var.setFastScrollVisible(true);
        x2Var.getFastScroll().setAlpha(0.0f);
        y2Var.O = new z2(this);
        x2Var.i(new a3());
        x2Var.setClipToPadding(false);
        addView(x2Var, gb1.i(-1, -1, 119));
        final int i11 = 0;
        x2Var.setOnItemClickListener(new zl0(this) { // from class: fi.r2
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zl0
            public final void c(int i12, View view) {
                Utilities.Callback2 callback2;
                switch (i11) {
                    case 0:
                        o3 o3Var = this.b;
                        ArrayList arrayList2 = o3Var.b0;
                        ArrayList arrayList3 = o3Var.h0;
                        if (i12 >= 2 && o3Var.W != null && (view instanceof k3)) {
                            k3 k3Var = (k3) view;
                            int i13 = i12 - 2;
                            if (!o3Var.c0) {
                                if (o3Var.d0) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        w7 w7Var = (w7) arrayList2.get(i13);
                                        o3Var.W.run(w7Var, w7Var.K ? o3.d(k3Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                o3Var.e(o3.j0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < o3Var.f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) o3Var.f0.get(i13);
                                if (arrayList3.isEmpty() && !o3Var.Q) {
                                    Utilities.Callback2 callback22 = o3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = o3.d(k3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > o3Var.R) {
                                        int i14 = -o3Var.N;
                                        o3Var.N = i14;
                                        AndroidUtilities.shakeViewSpring(k3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(o3Var.d);
                                    o3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        e3 e3Var = o3Var2.r;
                        org.telegram.ui.ActionBar.w0 w0Var = o3Var2.G;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < e3Var.c.size() && (callback2 = o3Var2.W) != null) {
                            callback2.run(e3Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        x2Var.setOnItemLongClickListener(new e1.c(this, 7));
        x2Var.setOnScrollListener(new b3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var);
        this.x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.x(436207615, false);
        kVar.y(-1, false);
        kVar.y(-1, true);
        addView(kVar, gb1.i(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new c3(this));
        org.telegram.ui.ActionBar.z l4 = kVar.l();
        d3 d3Var = new d3(this, context, l4, u6Var);
        this.F = d3Var;
        d3Var.setSubMenuOpenSide(1);
        kVar.addView(d3Var, 0, gb1.h(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i12 = 0;
        d3Var.setOnClickListener(new View.OnClickListener(this) { // from class: fi.s2
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.F.U(null, null);
                        break;
                    case 1:
                        o3 o3Var = this.b;
                        if (o3Var.I.getAlpha() >= 0.25f) {
                            o3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        o3 o3Var2 = this.b;
                        if (o3Var2.I.getAlpha() >= 0.25f) {
                            o3Var2.f(true);
                            break;
                        }
                        break;
                    default:
                        this.b.f(false);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        float f10 = 10.0f;
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        d3Var.addView(textView, gb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, gb1.i(-1, -1, 119));
        mm0 mm0Var = new mm0(context, u6Var);
        this.n = mm0Var;
        mm0Var.setLayoutManager(new s4.t(3));
        e3 e3Var = new e3(this);
        this.r = e3Var;
        mm0Var.setAdapter(e3Var);
        mm0Var.setOnScrollListener(new f3(this));
        mm0Var.setClipToPadding(true);
        mm0Var.i(new t2());
        frameLayout.addView(mm0Var, gb1.i(-1, -1, 119));
        u2 u2Var = new u2(context, u6Var);
        u2Var.setViewType(2);
        u2Var.setAlpha(0.0f);
        u2Var.setVisibility(8);
        frameLayout.addView(u2Var, gb1.i(-1, -1, 119));
        ey0 ey0Var = new ey0(context, u2Var, 11, u6Var);
        this.s = ey0Var;
        xh.n nVar = ey0Var.d;
        nVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.y6, u6Var);
        nVar.setTypeface(null);
        nVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new z3(this, false, new ai.i(this, 19));
        frameLayout.addView(ey0Var, gb1.i(-1, -1, 119));
        mm0Var.setEmptyView(ey0Var);
        org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new w2(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i13 = 1;
        mm0Var.setOnItemClickListener(new zl0(this) { // from class: fi.r2
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zl0
            public final void c(int i122, View view) {
                Utilities.Callback2 callback2;
                switch (i13) {
                    case 0:
                        o3 o3Var = this.b;
                        ArrayList arrayList2 = o3Var.b0;
                        ArrayList arrayList3 = o3Var.h0;
                        if (i122 >= 2 && o3Var.W != null && (view instanceof k3)) {
                            k3 k3Var = (k3) view;
                            int i132 = i122 - 2;
                            if (!o3Var.c0) {
                                if (o3Var.d0) {
                                    if (i132 >= 0 && i132 < arrayList2.size()) {
                                        w7 w7Var = (w7) arrayList2.get(i132);
                                        o3Var.W.run(w7Var, w7Var.K ? o3.d(k3Var) : null);
                                        break;
                                    } else {
                                        i132 -= arrayList2.size();
                                    }
                                }
                            } else if (i132 == 0) {
                                o3Var.e(o3.j0, true);
                                break;
                            } else {
                                i132 = i122 - 3;
                            }
                            if (i132 >= 0 && i132 < o3Var.f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) o3Var.f0.get(i132);
                                if (arrayList3.isEmpty() && !o3Var.Q) {
                                    Utilities.Callback2 callback22 = o3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = o3.d(k3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > o3Var.R) {
                                        int i14 = -o3Var.N;
                                        o3Var.N = i14;
                                        AndroidUtilities.shakeViewSpring(k3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(o3Var.d);
                                    o3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        e3 e3Var2 = o3Var2.r;
                        org.telegram.ui.ActionBar.w0 w0Var = o3Var2.G;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < e3Var2.c.size() && (callback2 = o3Var2.W) != null) {
                            callback2.run(e3Var2.c.get(i122), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().w.b;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                w7 w7Var = (w7) obj;
                if (!w7Var.g && !w7Var.w) {
                    this.b0.add(w7Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, linearLayout, u6Var);
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : f10) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, gb1.h(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d f11 = vh.f(24, context, u6Var, true);
            this.J = f11;
            f11.i(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(f11, gb1.o(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                final int i15 = 1;
                f11.setOnClickListener(new View.OnClickListener(this) { // from class: fi.s2
                    public final /* synthetic */ o3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.F.U(null, null);
                                break;
                            case 1:
                                o3 o3Var = this.b;
                                if (o3Var.I.getAlpha() >= 0.25f) {
                                    o3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                o3 o3Var2 = this.b;
                                if (o3Var2.I.getAlpha() >= 0.25f) {
                                    o3Var2.f(true);
                                    break;
                                }
                                break;
                            default:
                                this.b.f(false);
                                break;
                        }
                    }
                });
            }
            d f12 = vh.f(24, context, u6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            zq zqVar = new zq(R.drawable.mini_collage, 0);
            zqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            f12.i(spannableStringBuilder, false, true);
            linearLayout.addView(f12, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            f12.setOnClickListener(new View.OnClickListener(this) { // from class: fi.s2
                public final /* synthetic */ o3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.F.U(null, null);
                            break;
                        case 1:
                            o3 o3Var = this.b;
                            if (o3Var.I.getAlpha() >= 0.25f) {
                                o3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            o3 o3Var2 = this.b;
                            if (o3Var2.I.getAlpha() >= 0.25f) {
                                o3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
        } else {
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            int dp = AndroidUtilities.dp(56.0f);
            int i17 = org.telegram.ui.ActionBar.y6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i17, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
            imageView.setBackground(K);
            org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, u6Var);
            gb1.c(imageView, 0.1f, 1.5f);
            addView(imageView, gb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i18 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.s2
                public final /* synthetic */ o3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            this.b.F.U(null, null);
                            break;
                        case 1:
                            o3 o3Var = this.b;
                            if (o3Var.I.getAlpha() >= 0.25f) {
                                o3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            o3 o3Var2 = this.b;
                            if (o3Var2.I.getAlpha() >= 0.25f) {
                                o3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = j0;
        if (albumEntry == null || (albumEntry == albumEntry2 && this.b0.size() <= 0)) {
            ArrayList arrayList3 = this.g0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.e0 = MediaController.allMediaAlbumEntry;
            } else {
                this.e0 = (MediaController.AlbumEntry) this.g0.get(0);
            }
        } else {
            this.e0 = albumEntry;
        }
        this.f0 = b(this.e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(k3 k3Var) {
        Bitmap bitmap;
        if (k3Var == null || (bitmap = k3Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < albumEntry.photos.size(); i10++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            if (!this.L || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        h3 h3Var = this.f;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == NotificationCenter.storiesDraftsUpdated) {
                ArrayList arrayList = this.b0;
                arrayList.clear();
                if (!this.L) {
                    ArrayList arrayList2 = MessagesController.getInstance(this.a).getStoriesController().w.b;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        w7 w7Var = (w7) obj;
                        if (!w7Var.g && !w7Var.w) {
                            arrayList.add(w7Var);
                        }
                    }
                }
                h();
                i();
                if (h3Var != null) {
                    h3Var.l();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.e0 != null) {
            while (true) {
                if (i13 >= MediaController.allMediaAlbums.size()) {
                    break;
                }
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                int i14 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.e0;
                if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.e0 = albumEntry;
                    break;
                }
                i13++;
            }
        } else {
            ArrayList arrayList3 = this.g0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.e0 = MediaController.allMediaAlbumEntry;
            } else {
                this.e0 = (MediaController.AlbumEntry) this.g0.get(0);
            }
        }
        this.f0 = b(this.e0);
        this.h0.clear();
        i();
        if (h3Var != null) {
            h3Var.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g7 = g();
        boolean z10 = g7 <= ((float) org.telegram.messenger.t.c(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float e = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g7, 0.0f, e);
        if (z10 != this.w) {
            this.w = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.w ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.x;
        if (kVar != null) {
            kVar.setAlpha(e);
            int i10 = e <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        di.i4 i4Var = this.i0;
        if (i4Var != null) {
            i4Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.e0 = albumEntry;
        this.f0 = b(albumEntry);
        this.h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f.l();
        y2 y2Var = this.e;
        if (!z10) {
            y2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        mi.n nVar = new mi.n(getContext(), 2);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        y2Var.w0(nVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        k3 k3Var;
        if (this.a0 == null) {
            return;
        }
        ArrayList arrayList = this.h0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            x2 x2Var = this.d;
            if (i10 >= size) {
                this.a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(x2Var);
                j();
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                bitmap = null;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= x2Var.getChildCount()) {
                        k3Var = null;
                        break;
                    }
                    View childAt = x2Var.getChildAt(i11);
                    if (childAt instanceof k3) {
                        k3Var = (k3) childAt;
                        if (k3Var.S == photoEntry) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmap = d(k3Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        x2 x2Var = this.d;
        if (x2Var == null || x2Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < x2Var.getChildCount(); i11++) {
                View childAt = x2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        }
        return x2Var == null ? padding : AndroidUtilities.lerp(0, padding, x2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.e0;
    }

    public String getTitle() {
        return LocaleController.getString(this.L ? R.string.AddImage : R.string.ChoosePhotoOrVideo);
    }

    public final void h() {
        a aVar;
        d3 d3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d3Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.g0 = arrayList2;
        Collections.sort(arrayList2, new bi.p5(arrayList, 2));
        ArrayList arrayList3 = this.b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.g0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, albumEntry);
        }
        boolean isEmpty2 = this.g0.isEmpty();
        TextView textView = this.y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.b);
                }
            }
            d3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.q(14, this, albumEntry2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.g0;
        boolean z10 = true;
        boolean z11 = arrayList2 != null && !arrayList2.isEmpty() && this.g0.get(0) == this.e0 && this.b0.size() > 2;
        this.c0 = z11;
        if (z11 || (this.e0 != j0 && ((arrayList = this.g0) == null || arrayList.isEmpty() || this.g0.get(0) != this.e0))) {
            z10 = false;
        }
        this.d0 = z10;
    }

    public final void j() {
        ArrayList arrayList = this.h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        ImageView imageView = this.H;
        if (imageView != null) {
            vh.q(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), ds.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.i(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.T != z10) {
                this.T = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(ds.h).setDuration(320L).setListener(new bh.f0(10, this, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        k3.e0.clear();
        k3.f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = k3.c0;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp;
        float f7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        x2 x2Var = this.d;
        x2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        x2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        int dp4 = AndroidUtilities.dp(10.0f);
        TextView textView = this.y;
        textView.setPadding(0, i12, dp4, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f7 = 18.0f;
                textView.setTextSize(f7);
                super.onMeasure(i10, i11);
            }
        }
        f7 = 20.0f;
        textView.setTextSize(f7);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.R = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.W = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.a0 = callback3;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
