package af;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ b(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i10 = 2;
                final f fVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: af.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i10) {
                            case 0:
                                f fVar2 = fVar;
                                if (fVar2.a == 4) {
                                    fVar2.j.a.b().removeView(fVar2.f);
                                    fVar2.i = null;
                                    fVar2.f = null;
                                    fVar2.g = null;
                                    i iVar = fVar2.e;
                                    if (iVar != null) {
                                        iVar.b();
                                        fVar2.e = null;
                                    }
                                    i iVar2 = fVar2.d;
                                    if (iVar2 != null) {
                                        iVar2.b();
                                        fVar2.d = null;
                                    }
                                    h hVar = fVar2.h;
                                    if (((g) hVar.e) != null) {
                                        ((View) hVar.a).setBackground(null);
                                        hVar.e = null;
                                    }
                                    if (((g) hVar.d) == null && ((g) hVar.e) == null && (bitmap2 = (Bitmap) hVar.c) != null) {
                                        bitmap2.recycle();
                                        hVar.c = null;
                                    }
                                    fVar2.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (fVar2.n) {
                                        fVar2.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar2.a);
                                    break;
                                }
                                break;
                            case 1:
                                f fVar3 = fVar;
                                if (fVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    fVar3.h.B();
                                    fVar3.j.g.d(new bf.e(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
                                    fVar3.a = 2;
                                    if (!fVar3.n) {
                                        fVar3.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar3.a);
                                    break;
                                }
                                break;
                            default:
                                f fVar4 = fVar;
                                ye.d dVar = fVar4.j;
                                if (fVar4.a == 3) {
                                    dVar.g.f(new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f.invalidate();
                                    fVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.j, new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final f fVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: af.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i11) {
                            case 0:
                                f fVar22 = fVar2;
                                if (fVar22.a == 4) {
                                    fVar22.j.a.b().removeView(fVar22.f);
                                    fVar22.i = null;
                                    fVar22.f = null;
                                    fVar22.g = null;
                                    i iVar = fVar22.e;
                                    if (iVar != null) {
                                        iVar.b();
                                        fVar22.e = null;
                                    }
                                    i iVar2 = fVar22.d;
                                    if (iVar2 != null) {
                                        iVar2.b();
                                        fVar22.d = null;
                                    }
                                    h hVar = fVar22.h;
                                    if (((g) hVar.e) != null) {
                                        ((View) hVar.a).setBackground(null);
                                        hVar.e = null;
                                    }
                                    if (((g) hVar.d) == null && ((g) hVar.e) == null && (bitmap2 = (Bitmap) hVar.c) != null) {
                                        bitmap2.recycle();
                                        hVar.c = null;
                                    }
                                    fVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (fVar22.n) {
                                        fVar22.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                f fVar3 = fVar2;
                                if (fVar3.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    fVar3.h.B();
                                    fVar3.j.g.d(new bf.e(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
                                    fVar3.a = 2;
                                    if (!fVar3.n) {
                                        fVar3.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar3.a);
                                    break;
                                }
                                break;
                            default:
                                f fVar4 = fVar2;
                                ye.d dVar = fVar4.j;
                                if (fVar4.a == 3) {
                                    dVar.g.f(new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f.invalidate();
                                    fVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.j, new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                h hVar = this.b.h;
                if (((g) hVar.e) != null) {
                    ((View) hVar.a).setBackground(null);
                    hVar.e = null;
                }
                if (((g) hVar.d) == null && ((g) hVar.e) == null && (bitmap = (Bitmap) hVar.c) != null) {
                    bitmap.recycle();
                    hVar.c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                h hVar2 = this.b.h;
                Objects.requireNonNull(hVar2);
                AndroidUtilities.runOnUIThread(new e(hVar2, 0));
                break;
            default:
                final int i12 = 0;
                final f fVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: af.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        switch (i12) {
                            case 0:
                                f fVar22 = fVar3;
                                if (fVar22.a == 4) {
                                    fVar22.j.a.b().removeView(fVar22.f);
                                    fVar22.i = null;
                                    fVar22.f = null;
                                    fVar22.g = null;
                                    i iVar = fVar22.e;
                                    if (iVar != null) {
                                        iVar.b();
                                        fVar22.e = null;
                                    }
                                    i iVar2 = fVar22.d;
                                    if (iVar2 != null) {
                                        iVar2.b();
                                        fVar22.d = null;
                                    }
                                    h hVar3 = fVar22.h;
                                    if (((g) hVar3.e) != null) {
                                        ((View) hVar3.a).setBackground(null);
                                        hVar3.e = null;
                                    }
                                    if (((g) hVar3.d) == null && ((g) hVar3.e) == null && (bitmap2 = (Bitmap) hVar3.c) != null) {
                                        bitmap2.recycle();
                                        hVar3.c = null;
                                    }
                                    fVar22.a = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (fVar22.n) {
                                        fVar22.g();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + fVar22.a);
                                    break;
                                }
                                break;
                            case 1:
                                f fVar32 = fVar3;
                                if (fVar32.a == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    fVar32.h.B();
                                    fVar32.j.g.d(new bf.e(ApplicationLoader.applicationHandler, new b(fVar32, 2), 400L));
                                    fVar32.a = 2;
                                    if (!fVar32.n) {
                                        fVar32.h();
                                        break;
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + fVar32.a);
                                    break;
                                }
                                break;
                            default:
                                f fVar4 = fVar3;
                                ye.d dVar = fVar4.j;
                                if (fVar4.a == 3) {
                                    dVar.g.f(new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f.invalidate();
                                    fVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(dVar.j, new bf.e(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                    break;
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + fVar4.a);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
