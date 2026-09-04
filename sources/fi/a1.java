package fi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import di.nb;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class a1 {
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
    public org.telegram.ui.web.z0 k;
    public boolean l;
    public nb m;
    public nb o;
    public nb q;
    public nb s;
    public final x0 n = new x0(this, 0);
    public final x0 p = new x0(this, 1);
    public final y0 r = new y0(this);
    public final z0 t = new z0(this);

    public a1(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j3) {
        if (j3 >= 160) {
            return 3;
        }
        return j3 >= 60 ? 2 : 1;
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
            nb nbVar = this.m;
            if (nbVar != null) {
                AndroidUtilities.cancelRunOnUIThread(nbVar);
                this.m = null;
            }
            Sensor sensor2 = this.d;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.p, sensor2);
            }
            nb nbVar2 = this.o;
            if (nbVar2 != null) {
                AndroidUtilities.cancelRunOnUIThread(nbVar2);
                this.o = null;
            }
            Sensor sensor3 = this.g;
            y0 y0Var = this.r;
            if (sensor3 != null) {
                sensorManager.unregisterListener(y0Var, sensor3);
            }
            Sensor sensor4 = this.f;
            if (sensor4 != null) {
                sensorManager.unregisterListener(y0Var, sensor4);
            }
            nb nbVar3 = this.q;
            if (nbVar3 != null) {
                AndroidUtilities.cancelRunOnUIThread(nbVar3);
                this.q = null;
            }
            Sensor sensor5 = this.i;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.t, sensor5);
            }
            nb nbVar4 = this.s;
            if (nbVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(nbVar4);
                this.s = null;
            }
        }
    }

    public final boolean c(long j3) {
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
            this.c = j3;
            if (!this.l) {
                sensorManager.registerListener(this.n, defaultSensor, a(j3));
            }
        }
        return true;
    }

    public final boolean d(long j3) {
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
            this.e = j3;
            if (!this.l) {
                sensorManager.registerListener(this.p, defaultSensor, a(j3));
            }
        }
        return true;
    }

    public final boolean e(long j3, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            return false;
        }
        z0 z0Var = this.t;
        y0 y0Var = this.r;
        if (z10) {
            if (this.i != null) {
                nb nbVar = this.s;
                if (nbVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar);
                    this.s = null;
                }
                if (!this.l && (sensor = this.i) != null) {
                    sensorManager.unregisterListener(z0Var, sensor);
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
                this.h = j3;
                if (!this.l) {
                    sensorManager.registerListener(y0Var, sensor2, a(j3));
                    sensorManager.registerListener(y0Var, this.f, a(j3));
                    return true;
                }
            }
        } else {
            if (this.f != null || this.g != null) {
                nb nbVar2 = this.q;
                if (nbVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar2);
                    this.q = null;
                }
                if (!this.l) {
                    Sensor sensor3 = this.g;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(y0Var, sensor3);
                    }
                    Sensor sensor4 = this.f;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(y0Var, sensor4);
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
                this.j = j3;
                if (!this.l) {
                    sensorManager.registerListener(z0Var, defaultSensor2, a(j3));
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
        nb nbVar = this.m;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
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
        nb nbVar = this.o;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
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
            y0 y0Var = this.r;
            if (sensor != null) {
                sensorManager.unregisterListener(y0Var, sensor);
            }
            Sensor sensor2 = this.f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(y0Var, sensor2);
            }
            Sensor sensor3 = this.i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.t, sensor3);
            }
        }
        nb nbVar = this.q;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            this.q = null;
        }
        nb nbVar2 = this.s;
        if (nbVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar2);
            this.s = null;
        }
        this.g = null;
        this.f = null;
        this.i = null;
        return true;
    }
}
