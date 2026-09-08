package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class x3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final l3 F;
    public final org.telegram.ui.ActionBar.v0 G;
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
    public final org.telegram.ui.Components.e6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int a;
    public Utilities.Callback3 a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public final ArrayList b0;
    public final Paint c;
    public boolean c0;
    public final f3 d;
    public boolean d0;
    public final g3 e;
    public MediaController.AlbumEntry e0;
    public final p3 f;
    public ArrayList f0;
    public ArrayList g0;
    public final FrameLayout h;
    public final ArrayList h0;
    public bi.g5 i0;
    public final ll0 n;
    public final m3 r;
    public final xw0 s;
    public final j4 v;
    public boolean w;
    public final org.telegram.ui.ActionBar.k x;
    public final TextView y;

    public x3(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = new ArrayList();
        this.O = f7;
        this.a = i10;
        this.b = f6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), TLObject.FLAG_27);
        f3 f3Var = new f3(this, context, f6Var);
        this.d = f3Var;
        f3Var.setItemSelectorColorProvider(new androidx.emoji2.text.w(29));
        p3 p3Var = new p3(this);
        this.f = p3Var;
        f3Var.setAdapter(p3Var);
        g3 g3Var = new g3(this);
        this.e = g3Var;
        f3Var.setLayoutManager(g3Var);
        f3Var.setFastScrollEnabled(1);
        f3Var.setFastScrollVisible(true);
        f3Var.getFastScroll().setAlpha(0.0f);
        g3Var.O = new h3(this);
        f3Var.i(new i3());
        f3Var.setClipToPadding(false);
        addView(f3Var, w7.x5.e(-1, -1, 119));
        final int i11 = 0;
        f3Var.setOnItemClickListener(new zk0(this) { // from class: di.z2
            public final /* synthetic */ x3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void a(int i12, View view) {
                Utilities.Callback2 callback2;
                switch (i11) {
                    case 0:
                        x3 x3Var = this.b;
                        ArrayList arrayList2 = x3Var.b0;
                        ArrayList arrayList3 = x3Var.h0;
                        if (i12 >= 2 && x3Var.W != null && (view instanceof s3)) {
                            s3 s3Var = (s3) view;
                            int i13 = i12 - 2;
                            if (!x3Var.c0) {
                                if (x3Var.d0) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        o8 o8Var = (o8) arrayList2.get(i13);
                                        x3Var.W.run(o8Var, o8Var.K ? x3.d(s3Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                x3Var.e(x3.j0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < x3Var.f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) x3Var.f0.get(i13);
                                if (arrayList3.isEmpty() && !x3Var.Q) {
                                    Utilities.Callback2 callback22 = x3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = x3.d(s3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > x3Var.R) {
                                        int i14 = -x3Var.N;
                                        x3Var.N = i14;
                                        AndroidUtilities.shakeViewSpring(s3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(x3Var.d);
                                    x3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        x3 x3Var2 = this.b;
                        m3 m3Var = x3Var2.r;
                        org.telegram.ui.ActionBar.v0 v0Var = x3Var2.G;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < m3Var.c.size() && (callback2 = x3Var2.W) != null) {
                            callback2.run(m3Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        f3Var.setOnItemLongClickListener(new a1.c(this, 22));
        f3Var.setOnScrollListener(new j3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        this.x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.B(436207615, false);
        kVar.C(-1, false);
        kVar.C(-1, true);
        addView(kVar, w7.x5.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new k3(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        l3 l3Var = new l3(this, context, n10, f6Var);
        this.F = l3Var;
        l3Var.setSubMenuOpenSide(1);
        kVar.addView(l3Var, 0, w7.x5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i12 = 0;
        l3Var.setOnClickListener(new View.OnClickListener(this) { // from class: di.a3
            public final /* synthetic */ x3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.F.M(null, null);
                        break;
                    case 1:
                        x3 x3Var = this.b;
                        if (x3Var.I.getAlpha() >= 0.25f) {
                            x3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        x3 x3Var2 = this.b;
                        if (x3Var2.I.getAlpha() >= 0.25f) {
                            x3Var2.f(true);
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
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        l3Var.addView(textView, w7.x5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        ll0 ll0Var = new ll0(context, f6Var);
        this.n = ll0Var;
        ll0Var.setLayoutManager(new s4.s(3));
        m3 m3Var = new m3(this);
        this.r = m3Var;
        ll0Var.setAdapter(m3Var);
        ll0Var.setOnScrollListener(new n3(this));
        ll0Var.setClipToPadding(true);
        ll0Var.i(new b3());
        frameLayout.addView(ll0Var, w7.x5.e(-1, -1, 119));
        c3 c3Var = new c3(context, f6Var);
        c3Var.setViewType(2);
        c3Var.setAlpha(0.0f);
        c3Var.setVisibility(8);
        frameLayout.addView(c3Var, w7.x5.e(-1, -1, 119));
        xw0 xw0Var = new xw0(context, c3Var, 11, f6Var);
        this.s = xw0Var;
        wh.p pVar = xw0Var.d;
        pVar.setTextSize(1, 16.0f);
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
        pVar.setTypeface(null);
        pVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new j4(this, false, new bi.o1(this, 9));
        frameLayout.addView(xw0Var, w7.x5.e(-1, -1, 119));
        ll0Var.setEmptyView(xw0Var);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new e3(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i13 = 1;
        ll0Var.setOnItemClickListener(new zk0(this) { // from class: di.z2
            public final /* synthetic */ x3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void a(int i122, View view) {
                Utilities.Callback2 callback2;
                switch (i13) {
                    case 0:
                        x3 x3Var = this.b;
                        ArrayList arrayList2 = x3Var.b0;
                        ArrayList arrayList3 = x3Var.h0;
                        if (i122 >= 2 && x3Var.W != null && (view instanceof s3)) {
                            s3 s3Var = (s3) view;
                            int i132 = i122 - 2;
                            if (!x3Var.c0) {
                                if (x3Var.d0) {
                                    if (i132 >= 0 && i132 < arrayList2.size()) {
                                        o8 o8Var = (o8) arrayList2.get(i132);
                                        x3Var.W.run(o8Var, o8Var.K ? x3.d(s3Var) : null);
                                        break;
                                    } else {
                                        i132 -= arrayList2.size();
                                    }
                                }
                            } else if (i132 == 0) {
                                x3Var.e(x3.j0, true);
                                break;
                            } else {
                                i132 = i122 - 3;
                            }
                            if (i132 >= 0 && i132 < x3Var.f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) x3Var.f0.get(i132);
                                if (arrayList3.isEmpty() && !x3Var.Q) {
                                    Utilities.Callback2 callback22 = x3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = x3.d(s3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > x3Var.R) {
                                        int i14 = -x3Var.N;
                                        x3Var.N = i14;
                                        AndroidUtilities.shakeViewSpring(s3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(x3Var.d);
                                    x3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        x3 x3Var2 = this.b;
                        m3 m3Var2 = x3Var2.r;
                        org.telegram.ui.ActionBar.v0 v0Var = x3Var2.G;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < m3Var2.c.size() && (callback2 = x3Var2.W) != null) {
                            callback2.run(m3Var2.c.get(i122), null);
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
                o8 o8Var = (o8) obj;
                if (!o8Var.g && !o8Var.w) {
                    this.b0.add(o8Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, w7.x5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d g10 = wl.g(24, context, f6Var, true);
            this.J = g10;
            g10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                final int i15 = 1;
                g10.setOnClickListener(new View.OnClickListener(this) { // from class: di.a3
                    public final /* synthetic */ x3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.F.M(null, null);
                                break;
                            case 1:
                                x3 x3Var = this.b;
                                if (x3Var.I.getAlpha() >= 0.25f) {
                                    x3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                x3 x3Var2 = this.b;
                                if (x3Var2.I.getAlpha() >= 0.25f) {
                                    x3Var2.f(true);
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
            d g11 = wl.g(24, context, f6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            nq nqVar = new nq(R.drawable.mini_collage, 0);
            nqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            g11.g(spannableStringBuilder, false, true);
            linearLayout.addView(g11, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            g11.setOnClickListener(new View.OnClickListener(this) { // from class: di.a3
                public final /* synthetic */ x3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.F.M(null, null);
                            break;
                        case 1:
                            x3 x3Var = this.b;
                            if (x3Var.I.getAlpha() >= 0.25f) {
                                x3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            x3 x3Var2 = this.b;
                            if (x3Var2.I.getAlpha() >= 0.25f) {
                                x3Var2.f(true);
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
            imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            w7.z5.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: di.a3
                public final /* synthetic */ x3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.F.M(null, null);
                            break;
                        case 1:
                            x3 x3Var = this.b;
                            if (x3Var.I.getAlpha() >= 0.25f) {
                                x3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            x3 x3Var2 = this.b;
                            if (x3Var2.I.getAlpha() >= 0.25f) {
                                x3Var2.f(true);
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

    public static Bitmap d(s3 s3Var) {
        Bitmap bitmap;
        if (s3Var == null || (bitmap = s3Var.a) == null || bitmap.isRecycled()) {
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
        p3 p3Var = this.f;
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
                        o8 o8Var = (o8) obj;
                        if (!o8Var.g && !o8Var.w) {
                            arrayList.add(o8Var);
                        }
                    }
                }
                h();
                i();
                if (p3Var != null) {
                    p3Var.l();
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
        if (p3Var != null) {
            p3Var.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g10 = g();
        boolean z10 = g10 <= ((float) i2.g.f(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float e7 = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e7);
        if (z10 != this.w) {
            this.w = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.w ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.x;
        if (kVar != null) {
            kVar.setAlpha(e7);
            int i10 = e7 <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        bi.g5 g5Var = this.i0;
        if (g5Var != null) {
            g5Var.setAlpha(1.0f - e7);
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
        g3 g3Var = this.e;
        if (!z10) {
            g3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        ki.p pVar = new ki.p(getContext(), 2);
        pVar.a = 1;
        pVar.p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        g3Var.w0(pVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        s3 s3Var;
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
            f3 f3Var = this.d;
            if (i10 >= size) {
                this.a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(f3Var);
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
                    if (i11 >= f3Var.getChildCount()) {
                        s3Var = null;
                        break;
                    }
                    View childAt = f3Var.getChildAt(i11);
                    if (childAt instanceof s3) {
                        s3Var = (s3) childAt;
                        if (s3Var.S == photoEntry) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmap = d(s3Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        f3 f3Var = this.d;
        if (f3Var == null || f3Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < f3Var.getChildCount(); i11++) {
                View childAt = f3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        }
        return f3Var == null ? padding : AndroidUtilities.lerp(0, padding, f3Var.getAlpha());
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
        l3 l3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = l3Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.g0 = arrayList2;
        Collections.sort(arrayList2, new bi.l7(arrayList, 1));
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
            l3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.u1(4, this, albumEntry2));
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
            wl.q(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), pr.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.T != z10) {
                this.T = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(pr.h).setDuration(320L).setListener(new ah.q0(10, this, z10)).start();
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
        s3.e0.clear();
        s3.f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = s3.c0;
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
        f3 f3Var = this.d;
        f3Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        f3Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
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

    public void a() {
    }

    public void c(boolean z10) {
    }
}
