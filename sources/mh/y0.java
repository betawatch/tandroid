package mh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y0 {
    public final SensorManager a;
    public Sensor b;
    public long c;
    public Sensor d;
    public long e;
    public Sensor f;
    public Sensor g;
    public long h;
    public Sensor i;
    public long j;
    public org.telegram.ui.web.v0 k;
    public boolean l;
    public kh.f1 m;
    public kh.f1 o;
    public kh.f1 q;
    public kh.f1 s;
    public final v0 n = new v0(this, 0);
    public final v0 p = new v0(this, 1);
    public final w0 r = new w0(this);
    public final x0 t = new x0(this);

    public y0(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        return j10 >= 60 ? 2 : 1;
    }

    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            Sensor sensor = this.b;
            if (sensor != null) {
                sensorManager.unregisterListener(this.n, sensor);
            }
            kh.f1 f1Var = this.m;
            if (f1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(f1Var);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            kh.f1 f1Var2 = this.o;
            if (f1Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(f1Var2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            w0 w0Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(w0Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(w0Var, sensor4);
            }
            kh.f1 f1Var3 = this.q;
            if (f1Var3 != null) {
                AndroidUtilities.cancelRunOnUIThread(f1Var3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            kh.f1 f1Var4 = this.s;
            if (f1Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(f1Var4);
                this.s = null;
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.b == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.b = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.c = j10;
            if (!this.l) {
                sensorManager.registerListener(this.n, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        if (this.d == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            this.d = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.e = j10;
            if (!this.l) {
                sensorManager.registerListener(this.p, defaultSensor, a(j10));
            }
        }
        return true;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        x0 x0Var = this.t;
        w0 w0Var = this.r;
        if (z10) {
            if (this.i != null) {
                kh.f1 f1Var = this.s;
                if (f1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(x0Var, sensor);
                }
                this.i = null;
            }
            if (this.f == null || this.g == null) {
                this.g = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                this.f = defaultSensor;
                Sensor sensor2 = this.g;
                if (sensor2 == null || defaultSensor == null) {
                    return false;
                }
                this.h = j10;
                if (!this.l) {
                    sensorManager.registerListener(w0Var, sensor2, a(j10));
                    sensorManager.registerListener(w0Var, this.f, a(j10));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                kh.f1 f1Var2 = this.q;
                if (f1Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(w0Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(w0Var, sensor4);
                    }
                }
                this.g = null;
                this.f = null;
            }
            if (this.i == null) {
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                this.i = defaultSensor2;
                if (defaultSensor2 == null) {
                    return false;
                }
                this.j = j10;
                if (!this.l) {
                    sensorManager.registerListener(x0Var, defaultSensor2, a(j10));
                }
            }
        }
        return true;
    }

    public final boolean f() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.n, sensor);
        }
        kh.f1 f1Var = this.m;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.m = null;
        }
        this.b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.l) {
            sensorManager.unregisterListener(this.p, sensor);
        }
        kh.f1 f1Var = this.o;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.g;
        if (sensor == null && this.f == null && this.i == null) {
            return true;
        }
        if (!this.l) {
            w0 w0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(w0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(w0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        kh.f1 f1Var = this.q;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.q = null;
        }
        kh.f1 f1Var2 = this.s;
        if (f1Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
