package ef;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import c2.p;
import c5.j;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ b(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    public final void a(boolean z4) {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                final int i10 = 2;
                final f fVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ef.c
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
                                    h hVar = fVar2.e;
                                    if (hVar != null) {
                                        hVar.b();
                                        fVar2.e = null;
                                    }
                                    h hVar2 = fVar2.d;
                                    if (hVar2 != null) {
                                        hVar2.b();
                                        fVar2.d = null;
                                    }
                                    j jVar = fVar2.h;
                                    if (((g) jVar.e) != null) {
                                        ((View) jVar.a).setBackground(null);
                                        jVar.e = null;
                                    }
                                    if (((g) jVar.d) == null && ((g) jVar.e) == null && (bitmap2 = (Bitmap) jVar.c) != null) {
                                        bitmap2.recycle();
                                        jVar.c = null;
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
                                    fVar3.h.A();
                                    fVar3.j.g.e(new p(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
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
                                cf.f fVar5 = fVar4.j;
                                if (fVar4.a == 3) {
                                    fVar5.g.a(new p(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f.invalidate();
                                    fVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(fVar5.j, new p(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ef.c
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
                                    h hVar = fVar22.e;
                                    if (hVar != null) {
                                        hVar.b();
                                        fVar22.e = null;
                                    }
                                    h hVar2 = fVar22.d;
                                    if (hVar2 != null) {
                                        hVar2.b();
                                        fVar22.d = null;
                                    }
                                    j jVar = fVar22.h;
                                    if (((g) jVar.e) != null) {
                                        ((View) jVar.a).setBackground(null);
                                        jVar.e = null;
                                    }
                                    if (((g) jVar.d) == null && ((g) jVar.e) == null && (bitmap2 = (Bitmap) jVar.c) != null) {
                                        bitmap2.recycle();
                                        jVar.c = null;
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
                                    fVar3.h.A();
                                    fVar3.j.g.e(new p(ApplicationLoader.applicationHandler, new b(fVar3, 2), 400L));
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
                                cf.f fVar5 = fVar4.j;
                                if (fVar4.a == 3) {
                                    fVar5.g.a(new p(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f.invalidate();
                                    fVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(fVar5.j, new p(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
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
                j jVar = this.b.h;
                if (((g) jVar.e) != null) {
                    ((View) jVar.a).setBackground(null);
                    jVar.e = null;
                }
                if (((g) jVar.d) == null && ((g) jVar.e) == null && (bitmap = (Bitmap) jVar.c) != null) {
                    bitmap.recycle();
                    jVar.c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z4);
                break;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z4);
                j jVar2 = this.b.h;
                Objects.requireNonNull(jVar2);
                AndroidUtilities.runOnUIThread(new e(jVar2, 0));
                break;
            default:
                final int i12 = 0;
                final f fVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ef.c
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
                                    h hVar = fVar22.e;
                                    if (hVar != null) {
                                        hVar.b();
                                        fVar22.e = null;
                                    }
                                    h hVar2 = fVar22.d;
                                    if (hVar2 != null) {
                                        hVar2.b();
                                        fVar22.d = null;
                                    }
                                    j jVar3 = fVar22.h;
                                    if (((g) jVar3.e) != null) {
                                        ((View) jVar3.a).setBackground(null);
                                        jVar3.e = null;
                                    }
                                    if (((g) jVar3.d) == null && ((g) jVar3.e) == null && (bitmap2 = (Bitmap) jVar3.c) != null) {
                                        bitmap2.recycle();
                                        jVar3.c = null;
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
                                    fVar32.h.A();
                                    fVar32.j.g.e(new p(ApplicationLoader.applicationHandler, new b(fVar32, 2), 400L));
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
                                cf.f fVar5 = fVar4.j;
                                if (fVar4.a == 3) {
                                    fVar5.g.a(new p(ApplicationLoader.applicationHandler, new b(fVar4, 3), 400L));
                                    fVar4.f.invalidate();
                                    fVar4.a = 4;
                                    AndroidUtilities.doOnPreDraw(fVar5.j, new p(ApplicationLoader.applicationHandler, new b(fVar4, 4), 300L));
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
