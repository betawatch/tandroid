// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.media.projection.MediaProjectionManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ik8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ik8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lk0 lk0Var;
        nf9 nf9Var;
        byte b = this.a;
        boolean z = false;
        Object[] objArr = 0;
        final byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                mk8 mk8Var = (mk8) obj;
                if (!mk8Var.a) {
                    if (mk8Var.y != 0 || !mk8Var.E) {
                        mk8Var.a(false, true);
                        break;
                    } else {
                        ((Activity) mk8Var.getContext()).startActivityForResult(((MediaProjectionManager) mk8Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 1:
                bgc bgcVar = (bgc) obj;
                if (!bgcVar.a) {
                    if (bgcVar.x != 0) {
                        bgcVar.a(false, true);
                        break;
                    } else {
                        ((Activity) bgcVar.getContext()).startActivityForResult(((MediaProjectionManager) bgcVar.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 2:
                ((js8) obj).dismiss();
                break;
            case 3:
                yt8 yt8Var = (yt8) obj;
                ProxyListActivity proxyListActivity = yt8Var.s;
                fba fbaVar = yt8Var.d;
                fu8 fu8Var = new fu8(null);
                fu8Var.e = new b9a[3];
                fu8Var.f = new mhb[2];
                fu8Var.s = new vy8[3];
                fu8Var.E = 1.0f;
                fu8Var.F = new float[2];
                fu8Var.G = true;
                fu8Var.M = new bu8(fu8Var, (byte) 0);
                fu8Var.K = fbaVar;
                proxyListActivity.presentFragment(fu8Var);
                break;
            case 4:
                ((ov8) obj).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 5:
                a89 a89Var = (a89) obj;
                u41 u41Var = a89Var.s;
                if (u41Var.e0 && !u41Var.R) {
                    u41Var.setLoading(true);
                    b89 b89Var = a89Var.w;
                    CharSequence text = ((TextView) a89Var.h.b).getText();
                    byte[] bArr = a89Var.d.option;
                    String charSequence = a89Var.n.getText().toString();
                    int i = b89.v1;
                    b89Var.J0(text, bArr, charSequence);
                    break;
                }
                break;
            case 6:
                y79 y79Var = (y79) ((jo0) obj).e;
                if (y79Var != null) {
                    y79Var.run();
                    break;
                }
                break;
            case 7:
                ((i99) obj).performClick();
                break;
            case 8:
                ((cb9) obj).dismiss();
                break;
            case 9:
                ac9 ac9Var = (ac9) obj;
                he9 he9Var = ac9Var.h;
                if (he9Var != null && (lk0Var = ac9Var.f) != null) {
                    ye9 ye9Var = he9Var.a;
                    if (ye9.t3(lk0Var)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lk0Var.b;
                        ld9 ld9Var = ye9Var.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        ye9Var.g3.O(true);
                        ld9 ld9Var2 = ye9Var.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 10:
                pf9 pf9Var = (pf9) obj;
                lk0 lk0Var2 = pf9Var.a;
                if (lk0Var2 != null && (nf9Var = pf9Var.H) != null) {
                    ((ue9) nf9Var).a.p3.w(lk0Var2);
                    break;
                }
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                    qp9 qp9Var = saveToGallerySettingsActivity.c;
                    l.put(qp9Var.d, qp9Var);
                    saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 12:
                ((tq9) obj).onBackPressed();
                break;
            case 13:
                ((b04) obj).f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 14:
                ((wb5) obj).dismiss();
                break;
            case 15:
                hs9 hs9Var = (hs9) ((gx0) obj).d;
                Activity activity = hs9Var.G;
                d dVar = hs9Var.H;
                int i2 = i61.m1;
                if (dVar != null && activity != null) {
                    final i61 i61Var = new i61(b2, activity, z);
                    i61Var.w0 = false;
                    i61Var.v0 = false;
                    int i3 = bkb.c6;
                    i61Var.M(i3);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(bkb.f0(bkb.v0(bkb.h6, i61Var.J0), 1, -1));
                    zkb.s(imageView, bkb.zj, i61Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(R.drawable.ic_layer_close);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: zp3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b3 = objArr2;
                            i61 i61Var2 = i61Var;
                            switch (b3) {
                                case 0:
                                    i61Var2.dismiss();
                                    break;
                                default:
                                    i61Var2.dismiss();
                                    up3 q = up3.q(i61Var2.a);
                                    q.I.clear();
                                    q.getNotificationCenter().k(kk7.d5, new Object[0]);
                                    q.getMessagesStorage().a.c(new rp3(q, (byte) 2));
                                    break;
                            }
                        }
                    });
                    int L = gl.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, nme.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    aza azaVar = new aza(activity, i61Var.a);
                    azaVar.setStickerNum(9);
                    azaVar.getImageReceiver().M(1);
                    linearLayout.addView(azaVar, nme.t(kk7.u1, kk7.u1, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i4 = bkb.i5;
                    zkb.X(textView, i4, null);
                    ir2.r(20.0f, 1, 2131751334, textView, null);
                    linearLayout.addView(textView, nme.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    zkb.X(textView2, i4, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(k96.a0("DownloadedFilesMessage", null, 2131751333, new Object[0]));
                    linearLayout.addView(textView2, nme.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(gl.o());
                    textView3.setText(k96.M0(2131748505, null));
                    zkb.X(textView3, bkb.Ii, null);
                    int L2 = gl.L(8.0f);
                    int i5 = bkb.Ei;
                    int w0 = bkb.w0(null, i5, false);
                    int o = bm2.o(bkb.w0(null, i3, false), 120);
                    ff0 i0 = bkb.i0(L2, L2, L2, L2, w0, o, o);
                    vkb M = zkb.M(i5);
                    vkb g = zkb.g(i3, 120);
                    textView3.setBackground(i0);
                    zkb.j(textView3, i0, M, g, null);
                    linearLayout.addView(textView3, nme.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(gl.o());
                    textView4.setText(k96.M0(2131752081, null));
                    zkb.X(textView4, i5, null);
                    int L3 = gl.L(8.0f);
                    int o2 = bm2.o(bkb.w0(null, i5, false), 120);
                    ff0 i02 = bkb.i0(L3, L3, L3, L3, 0, o2, o2);
                    vkb g2 = zkb.g(i5, 120);
                    textView4.setBackground(i02);
                    zkb.j(textView4, i02, null, g2, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, nme.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    i61Var.O = nestedScrollView;
                    textView3.setOnClickListener(new xf3((Object) i61Var, (Object) dVar, (byte) 6));
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: zp3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b3 = b2;
                            i61 i61Var2 = i61Var;
                            switch (b3) {
                                case 0:
                                    i61Var2.dismiss();
                                    break;
                                default:
                                    i61Var2.dismiss();
                                    up3 q = up3.q(i61Var2.a);
                                    q.I.clear();
                                    q.getNotificationCenter().k(kk7.d5, new Object[0]);
                                    q.getMessagesStorage().a.c(new rp3(q, (byte) 2));
                                    break;
                            }
                        }
                    });
                    i61Var.show();
                    break;
                }
                break;
            case 16:
                ps0 ps0Var = ((js9) obj).d;
                ps0Var.setText("");
                gl.F3(ps0Var);
                break;
            case 17:
                new jh8(((vs9) obj).b, 24, true).show();
                break;
            case 18:
                ((tt9) obj).R(false);
                break;
            case 19:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                k27 k27Var = secretMediaViewer.g0;
                if (k27Var != null) {
                    TLRPC.Message message = k27Var.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        je5 je5Var = secretMediaViewer.r;
                        if (!je5Var.W) {
                            secretMediaViewer.m();
                            break;
                        } else {
                            je5Var.f(true);
                            break;
                        }
                    }
                }
                break;
            case 20:
                iy9 iy9Var = (iy9) obj;
                if (iy9Var.V1 instanceof TLRPC.User) {
                    u41 u41Var2 = iy9Var.c2;
                    if (!u41Var2.R) {
                        u41Var2.setLoading(true);
                        iy9Var.Y0((TLRPC.User) iy9Var.V1, null, null);
                        break;
                    }
                }
                break;
            case 21:
                Runnable runnable = ((cz9) obj).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 22:
                o0a o0aVar = (o0a) obj;
                oj ojVar = o0aVar.y1.a;
                oj ojVar2 = oj.b;
                if (ojVar == ojVar2) {
                    ojVar2 = oj.a;
                }
                o0aVar.E0(nj.j(0L, ojVar2), true, false, true);
                o0aVar.m1.setText("");
                break;
            case 23:
                SessionsActivity sessionsActivity = ((h7a) obj).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                        da1.i0(sessionsActivity.getParentActivity(), 2, new f7a(sessionsActivity));
                        break;
                    } else {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    }
                }
                break;
            case 24:
                bba bbaVar = (bba) ((ev3) obj).w;
                ArrayList arrayList = bbaVar.s;
                if (!arrayList.isEmpty()) {
                    bbaVar.r = TextUtils.join(" ", arrayList).toString();
                    bbaVar.n = false;
                    bbaVar.d();
                    bbaVar.x = null;
                    if (bbaVar.b != 0) {
                        bbaVar.b = (byte) 0;
                        aba abaVar = bbaVar.I;
                        if (abaVar != null) {
                            ((ag3) abaVar).g(0);
                            break;
                        }
                    }
                }
                break;
            case 25:
                d dVar2 = ((zda) obj).f.y1;
                if (dVar2 != null && dVar2.getParentLayout() != null) {
                    ((ActionBarLayout) dVar2.getParentLayout()).p();
                    break;
                }
                break;
            case 26:
                ((z6a) obj).run();
                break;
            case 27:
                rfa rfaVar = (rfa) obj;
                if (rfaVar.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    pfa pfaVar = rfaVar.d;
                    int i6 = rfaVar.c[intValue];
                    k27 k27Var2 = rfaVar.b[intValue];
                    af4 af4Var = ((ye4) ((gi3) pfaVar).a).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
                    af4Var.e(i6, rfaVar, k27Var2, intValue);
                    break;
                }
                break;
            case 28:
                sha shaVar = (sha) obj;
                if (!shaVar.y.f) {
                    if (!shaVar.x.f) {
                        if (shaVar.c == rha.b) {
                            gl.B3(4.0f, shaVar, null);
                            break;
                        }
                    } else {
                        pha phaVar = shaVar.a;
                        boolean z2 = shaVar.b;
                        c6 c6Var = phaVar.W;
                        if (c6Var != null) {
                            c6Var.b(z2 ? 1 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                DictationAsr.a0(!DictationAsr.x());
                ((zka) obj).d0();
                break;
        }
    }
}
